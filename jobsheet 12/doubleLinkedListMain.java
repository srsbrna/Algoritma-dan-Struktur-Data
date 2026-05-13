import java.util.Scanner;

public class doubleLinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doubleLinkedList dll = new doubleLinkedList();
        int pilih;

        do {
            System.out.println("\n=== MENU DOUBLE LINKED LIST ===");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisipkan Setelah NIM Tertentu");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Hapus Data Pertama");
            System.out.println("6. Hapus Data Terakhir");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

         switch (pilih) {
                case 1:
                case 2:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    mahasiswa25 mhs = new mahasiswa25(nim, nama, kelas, ipk);

                    if (pilih == 1) {
                        dll.addFirst(mhs);
                    } else {
                        dll.addLast(mhs);
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM setelah data yang akan disisipkan: ");
                    String keyNim = sc.nextLine();

                    System.out.print("NIM   : ");
                    nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    ipk = sc.nextDouble();
                    sc.nextLine();

                    mhs = new mahasiswa25(nim, nama, kelas, ipk);
                    dll.insertAfter(keyNim, mhs);
                    break;
                
                case 4:
                    dll.print();
                    break;

                case 5:
                    dll.removeFirst();
                    break;

                case 6:
                    dll.removeLast();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
