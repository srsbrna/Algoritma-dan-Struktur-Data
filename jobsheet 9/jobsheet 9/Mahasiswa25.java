public class Mahasiswa25 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    // Konstruktor
    Mahasiswa25(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1; // default
    }

    // Method memberi nilai
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}