import java.util.Scanner;
public class DosenMain25{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen25 daftarDosen = new DataDosen25();

        while (true) {
            System.out.println("\n----- Menu Data Dosen -----");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting usia ASC (bubble sort)");
            System.out.println("4. Sorting usia DSC (selection sort)");
            System.out.println("5. Sorting usia DSC (Insertion sort)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: 
                    System.out.print("Masukkan kode             : ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan nama             : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan jenis kelamin (true = Pria, false = Wanita)   : ");
                    Boolean jk = input.nextBoolean();
                    System.out.print("Masukkan usia             : ");
                    int usia = input.nextInt();
                    daftarDosen.tambah(new Dosen25(kode, nama, jk, usia));
                    break;
                case 2: 
                    daftarDosen.tampil();
                    break;
                case 3: 
                    daftarDosen.SortingASC();
                    daftarDosen.tampil();
                    break;
                case 4: 
                    daftarDosen.SortingDSC();
                    daftarDosen.tampil();
                    break;
                case 5: 
                    daftarDosen.insertionSort();
                    daftarDosen.tampil();
                    break;
                case 6: 
                    System.out.println("Keluar program");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid");     
            }
        }
    }
}