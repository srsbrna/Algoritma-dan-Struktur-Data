
import java.util.Scanner;

class Matakuliah25 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah25(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void cetakInfo() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jam : " + jumlahJam);
    }
}

public class mataKuliahDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah25[] arrayOfMatakuliah25 = new Matakuliah25[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data matakuliah ke-" + (i+1));
            System.out.println("Kode       : ");
            kode = sc.nextLine();
            System.out.println("Nama       : ");
            nama = sc.nextLine();
            System.out.println("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------");

            arrayOfMatakuliah25[i] = new Matakuliah25(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data mata kuliah ke-" + (i+1));
            System.out.println("Kode       : "+ arrayOfMatakuliah25[i].kode);
            System.out.println("Nama       : "+ arrayOfMatakuliah25[i].nama);
            System.out.println("Sks        : "+ arrayOfMatakuliah25[i].sks);
            System.out.println("Jumlah Jam : "+ arrayOfMatakuliah25[i].jumlahJam);
            System.out.println("-------------------------------");

            arrayOfMatakuliah25[i].cetakInfo();
        }
    }
}
