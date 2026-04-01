package minggu5;

import java.util.Scanner;

public class mainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai basis elemen ke-" +(i+1) +": ");
            int basis = input.nextInt();
            System.out.println("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new pangkat(basis,pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBf(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDc(p.nilai, p.pangkat));
        }
    }
}
