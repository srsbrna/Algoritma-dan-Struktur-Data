import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);      
        perpustakaan p = new perpustakaan();

        int pilihan;

        do {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Peminjaman");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode buku: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String penulis = sc.nextLine();

                    p.tambahBuku(new buku(kode, judul, penulis));
                    break;

                case 2:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = sc.nextLine();

                    p.tambahMahasiswa(new mahasiswa(nim, nama));
                    break;

                case 3:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nimPinjam = sc.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    String kodePinjam = sc.nextLine();

                    p.pinjamBuku(nimPinjam, kodePinjam);
                    break;

                case 4:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nimKembali = sc.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    String kodeKembali = sc.nextLine();

                    p.kembalikanBuku(nimKembali, kodeKembali);
                    break;

                case 5:
                    p.tampilkanPeminjaman();
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 6);

        sc.close();
    }
}
