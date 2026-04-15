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
            System.out.println("6. Tambah peminjaman");
            System.out.println("7. Tampilkan Statistik");
            System.out.println("8. Laporan per mahasiswa");
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

                    System.out.println("\nSetelah diurutkan dengan Insertion Sort (Denda terbesar):");

                    for (peminjaman p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();

                    peminjaman[] temp = new peminjaman[pinjam.length];
                    for (int i = 0; i < pinjam.length; i++) {
                        temp[i] = pinjam[i];
                    }

                    for (int i = 1; i < temp.length; i++) {
                        peminjaman key = temp[i];
                        int j = i - 1;

                        while (j >= 0 && temp[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                            temp[j + 1] = temp[j];
                            j--;
                        }
                        temp[j + 1] = key;
                    }

                    int left = 0, right = temp.length - 1;
                    int found = -1;

                    while (left <= right) {
                        int mid = (left + right) / 2;

                        int cmp = temp[mid].mhs.nim.compareTo(cari);

                        if (cmp == 0) {
                            found = mid;
                            break;
                        } else if (cmp < 0) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }

                    if (found == -1) {
                        System.out.println("Data tidak ditemukan!");
                    } else {
                        System.out.println("[Binary Search] Data ditemukan:");

                        int i = found;

                        
                        while (i >= 0 && temp[i].mhs.nim.equals(cari)) {
                            i--;
                        }
                        i++;

                        while (i < temp.length && temp[i].mhs.nim.equals(cari)) {
                            temp[i].tampil();
                            i++;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Masukkan NIM: ");
                    String nimInput = sc.next();

                    mahasiswa mhsDipilih = null ;
                    for (mahasiswa m : mhs) {
                        if (m.nim.equals(nimInput)) {
                            mhsDipilih = m;
                            break;
                        }
                    }

                    if (mhsDipilih == null) {
                        System.out.println("NIM tidak ditemukan!");
                        break;
                    }

                    System.out.println(("Masukkan kode buku: "));
                    String kodeInput = sc.next();

                    buku bukuDipilih = null;
                    for (buku b : buku) {
                        if (b.kode.equals(kodeInput)) {
                            bukuDipilih = b;
                            break;
                        }
                    }

                    if (bukuDipilih == null) {
                        System.out.println("Kode buku tidak ditemukan!");
                        break;
                    }

                    System.out.println("Masukkan lama pinjaman: ");
                    int lama = sc.nextInt();

                    peminjaman[] baru = new peminjaman[pinjam.length + 1];
                    for (int i = 0; i < pinjam.length; i++) {
                        baru[i] = pinjam[i];    
                    }

                    baru[pinjam.length] = new peminjaman(mhsDipilih, bukuDipilih, lama);
                    pinjam = baru;

                    System.out.println("Data peminjaman berhasil ditambahkan!");
                    break;

                case 7:
                    int totalDenda = 0;
                    int terlambat = 0;
                    int tepat = 0;

                    for (peminjaman p : pinjam) {
                        totalDenda += p.denda;

                        if (p.terlambat > 0) {
                            terlambat++;
                        } else {
                            tepat++;
                        }
                    }

                    System.out.println("\n=== STATISTIK PEMINJAMAN ===");
                    System.out.println("Total Denda: Rp " + totalDenda);
                    System.out.println("Jumlah Terlambat: " + terlambat);
                    System.out.println("Jumlah Tepat Waktu: " + tepat);
                    break;

                case 8:
                    System.out.println("Laporan per mahasiswa: ");
                    

                
                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

                

        } while (pilih != 0);
    }
}