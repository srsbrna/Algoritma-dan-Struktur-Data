import java.util.Scanner;

public class MainKasir {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DoubleLinkedListAntrean antrean = new DoubleLinkedListAntrean();
        DoubleLinkedListPesanan daftarPesanan = new DoubleLinkedListPesanan();

        int pilih;

        do {
            System.out.println("\n====================================");
            System.out.println("   SISTEM ANTREAN RESTO ROYAL DELISH");
            System.out.println("====================================");
            System.out.println("1. Tambah Antrean");
            System.out.println("2. Cetak Antrean");
            System.out.println("3. Hapus Antrean & Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

             switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    pembeli pembeli = new pembeli(nama, hp);
                    antrean.addLast(pembeli);
                    break;

                case 2:
                    antrean.print();
                    System.out.println("Jumlah antrean: " + antrean.size());
                    break;

                case 3:
                    nodeAntrean dipanggil = antrean.removeFirst();

                    if (dipanggil != null) {
                        System.out.println("\nPembeli dipanggil:");
                        System.out.println("No Antrean : " + dipanggil.nomorAntrean);
                        System.out.println("Nama       : " + dipanggil.data.namaPembeli);

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Menu    : ");
                        String menu = sc.nextLine();

                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        pesanan pesanan = new pesanan(kode, menu, harga);

                        daftarPesanan.addLast(
                                dipanggil.nomorAntrean,
                                dipanggil.data,
                                pesanan
                        );
                    }
                    break;

                case 4:
                    daftarPesanan.printLaporan();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilih != 4);

    }

}
