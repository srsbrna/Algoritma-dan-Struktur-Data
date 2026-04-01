public class Dosen25 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen25(String kd, String name, Boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }
    public void tampil() {
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + usia);
        System.out.println("=====================================");
    }
}