package minggu5;

import java.util.Scanner;

public class mainFaktorial {
    int faktorialBf(int n){
        int fakto = 1;
        for (int i=1; i<=n; i++){
            fakto = fakto * i;
        }
        return fakto;
    }

    int faktorialDc(int n){
        if (n==1){
            return 1;
        } else{
            int fakto = n * faktorialDc(n-1);
            return fakto;
        }  
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nilai: ");
    int nilai = input.nextInt();
    
    faktorial fk = new faktorial();
    System.out.println("Nilai faktorial " + nilai + " menggunakan Bf: " + fk.faktorialBF(nilai));
    System.out.println("Nilai faktorial " + nilai + " menggunakan Dc: " +fk.faktorialDc(nilai));
    }
}

