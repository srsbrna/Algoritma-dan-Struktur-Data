    import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat25 stack = new StackSurat25(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat25 s = new Surat25(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat berhasil ditambahkan");
                    break;

                case 2:
                    Surat25 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat:");
                        System.out.println("ID: " + proses.idSurat);
                        System.out.println("Nama: " + proses.namaMahasiswa);
                        System.out.println("Jenis Izin: " + proses.jenisIzin);
                    }
                    break;

                case 3:
                    Surat25 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                    } else {
                        System.out.println("Stack masih kosong!");
                    }
                    break;

                case 4:
                    System.out.print("Cari nama mahasiswa: ");
                    String cari = scan.nextLine();
                    if (stack.cari(cari)) {
                        System.out.println("Surat ditemukan!");
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 0);
    }
}
