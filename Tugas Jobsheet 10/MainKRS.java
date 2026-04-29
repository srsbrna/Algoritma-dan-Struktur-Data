import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS();
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian (Proses 2 Orang)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan & Akhir");
            System.out.println("5. Cetak Statistik & Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    sc.nextLine();
                    System.out.print("NIM: "); 
                    String nim = sc.nextLine();
                    System.out.print("Nama: "); 
                    String nama = sc.nextLine();
                    antrian.tambahAntrian(new Mahasiswa25(nim, nama));
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDepan();
                    antrian.tampilkanAkhir();
                    break;
                case 5:
                    antrian.cetakStatistik();
                    break;
                case 6:
                    antrian.kosongkanAntrian();
                    break;
            }
        }while (pilih != 0);
    }
}
