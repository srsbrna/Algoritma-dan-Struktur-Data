import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue25 antrian = new Queue25(5);

        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Depan");
            System.out.println("4. Cek Belakang");
            System.out.println("5. Tampilkan Semua");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
        
            switch (pilih) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    antrian.enqueue(nim, nama);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.peekDepan();
                    break;

                case 4:
                    antrian.peekBelakang();
                    break;

                case 5:
                    antrian.printQueue();
                    break;

                case 6:
                    antrian.clear();
                    break;

                case 7:
                    System.out.println("Jumlah antrian: " + antrian.getSize());
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }
        }  while (pilih != 0);
    }
}
