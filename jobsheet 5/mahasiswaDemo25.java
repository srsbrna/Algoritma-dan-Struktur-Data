import java.util.Scanner;

public class mahasiswaDemo25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa25 m = new mahasiswa25(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubblesort();        
        System.out.println("\nData mahasiswa setelah sorting(DESC): ");
        list.tampil();

        System.out.println("Data yang sudah diurutkan menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah diurutkan menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}