public class dosenMain25 {
    public static void main(String[] args) {
        dosen25 ds1 = new dosen25();
        ds1.idDosen = "D01";
        ds1.nama = "Bu Desy";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2020;
        ds1.bidangKeahlian = "Matematika";

        dosen25 ds2 = new dosen25("D02", "Pak Yan", true, 2005, "Algoritma dan Struktur Data");

        ds1.tampilkanInformasi();
        ds1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + ds1.hitungMasaKerja(2025) + "tahun");
        ds1.ubahKeahlian("Basis data");

        ds2.tampilkanInformasi();
    }
}
