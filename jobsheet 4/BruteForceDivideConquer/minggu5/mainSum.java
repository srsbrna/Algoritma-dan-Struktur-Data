package minggu5;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jumlah elemen: ");
    int elemen = input.nextInt();

    sum sm = new sum(elemen);
    for (int i = 0; i < elemen; i++) {
        System.out.println("Masukkan keuntungan ke-" + (i+1) + ": ");
        sm.keuntungan[i] = input.nextDouble();
    }


    System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBf());
    System.out.println("Total keuntungan menggunakan Divide and Conquer: "+ sm.totalDc(sm.keuntungan, 0, elemen-1));
    
    }
}
