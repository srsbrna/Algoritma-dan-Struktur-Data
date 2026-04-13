import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        mahasiswa[] mhs = {
                new mahasiswa("22001", "Andi", "TI"),
                new mahasiswa("22002", "Budi", "TI"),
                new mahasiswa("22003", "Citra", "SIB")
        };

        buku[] buku = {
                new buku("B001", "Algoritma", 2020),
                new buku("B002", "Basis Data", 2019),
                new buku("B003", "Pemrograman", 2021),
                new buku("B004", "Fisika", 2024)
        };

        peminjaman[] pinjam = {
                new peminjaman(mhs[0], buku[0], 7),
                new peminjaman(mhs[1], buku[1], 3),
                new peminjaman(mhs[2], buku[2], 10),
                new peminjaman(mhs[2], buku[3], 6),
                new peminjaman(mhs[0], buku[1], 4)
        };

        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan mahasiswa");
            System.out.println("2. Tampilkan buku");
            System.out.println("3. Tampilkan peminjaman");
            System.out.println("4. Urutkan berdasarkan denda");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (mahasiswa m : mhs) {
                        m.tampil();
                    }
                    break;

                case 2:
                    System.out.println("\nData Buku:");
                    for (buku b : buku) {
                        b.tampil();
                    }
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (peminjaman p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 4:
                    for (int i = 1; i < pinjam.length; i++) {
                        peminjaman temp = pinjam[i];
                        int j = i - 1;

                        while (j >= 0 && pinjam[j].denda < temp.denda) {
                            pinjam[j + 1] = pinjam[j];
                            j--;
                        }
                        pinjam[j + 1] = temp;
                    }

                    System.out.println("\nSetelah diurutkan (Denda terbesar):");

                    for (peminjaman p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();

                    boolean ketemu = false;
                    for (peminjaman p : pinjam) {
                        if (p.mhs.nim.equals(cari)) {
                            p.tampil();
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}