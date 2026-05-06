import java.util.Scanner;

public class SLLMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList25 sll = new SingleLinkedList25();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine(); // buang enter

        for (int i = 0; i < n; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // buang enter

            Mahasiswa25 mhs = new Mahasiswa25(nim, nama, kelas, ipk);

            sll.addLast(mhs);
        }

        sll.print();
    }
}