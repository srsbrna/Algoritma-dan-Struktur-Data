public class mataKuliahMain25 {
    public static void main(String[] args) {
        mataKuliah25 mk1 = new mataKuliah25(); //CONTOH INISIASI TANPA MENGGUNAKAN PARAMETER (DEFAULT)
        mk1.kodeMK = "MK01";
        mk1.nama = "Dasar Pemrograman";
        mk1.sks = 4;
        mk1.jumlahJam = 8;

        mataKuliah25 mk2 = new mataKuliah25(
            "MK02", "Praktikum Dasar Pemrograman", 3, 6
        ); //CONTOH INISIASI MENGGUNAKAN PARAMETER

        mk1.tampilkanInformasi();
        mk1.ubahSks(3);
        mk1.kurangiJam(10);
        mk1.tampilkanInformasi();

        mk2.tampilkanInformasi();
        mk2.tambahJam(2);
    }
}
