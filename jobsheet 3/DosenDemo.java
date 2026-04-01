
import java.util.Scanner;

class dosen25 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public dosen25(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil () {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis kelamin : " + (jenisKelamin ? "pria" : "wanita"));
        System.out.println("Usia          : " + usia);
    }
}

public class DosenDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        dosen25[] arrayOfDosen = new dosen25[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i+1));

            System.out.print("Kode : ");
            String kode = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Jenis kelamin (true=Pria | false=wanita) : ");
            boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new dosen25(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n=== Data Dosen ===");
        for (dosen25 d : arrayOfDosen) {
            d.tampil();
            System.out.println("-------------------------");    
        }

        dataDosen25 data = new dataDosen25();

        System.out.println("\n=== Data Semua Dosen ===");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n=== Jumlah Dosen ===");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n=== Rerata Usia ===");
        data.rataUsiaDosenPerJenisKelamin(arrayOfDosen);

        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenPalingMuda(arrayOfDosen);
    }
}