public class mataKuliah25 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public mataKuliah25() {
    }

    public mataKuliah25(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi () {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " +jumlahJam);
    }

    void ubahSks(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah Jam berhasil diubah menjadi " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam){
        jumlahJam -= jam;
        System.out.println("Jumlah jam berhasil dikurangi menjadi " + jumlahJam);
        } else {
        System.out.println("Pengurangan tidak dapat dilakukan karena jumlah jam tidak mencukupi");
        }
    }
}