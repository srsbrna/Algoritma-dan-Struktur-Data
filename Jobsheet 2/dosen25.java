

public class dosen25 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public dosen25() {

    }

    public dosen25(String idDosen, String nama, boolean status, int thn, String bidang) {
        this.idDosen = idDosen;
        this.nama = nama;
        statusAktif = status;
        tahunBergabung = thn;
        bidangKeahlian = bidang;
    }

    void tampilkanInformasi () {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status aktif: " + statusAktif);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status aktif berhasil diubah menjadi " + statusAktif);
    }

    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi " + bidangKeahlian);
    }
}
