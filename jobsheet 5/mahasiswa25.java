public class mahasiswa25 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public mahasiswa25() {

    }
    public mahasiswa25(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    void tampilInformasi() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("IPK     : " + ipk);
        System.out.println("Kelas   : " + kelas);
    }
}