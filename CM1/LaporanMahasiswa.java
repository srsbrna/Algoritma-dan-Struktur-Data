public class LaporanMahasiswa {
    mahasiswa mhs;
    int totalPinjam;
    int totalDenda;
    int totalTerlambat;
    
    LaporanMahasiswa(mahasiswa mhs) {
        this.mhs = mhs;
    }

    void hitungLapora(peminjaman[] pinjam) {
        totalPinjam = 0;
        totalDenda = 0 ;
        totalTerlambat = 0;

        for (peminjaman p : pinjam) {
            if (p.mhs.nim.equals(mhs.nim));
            totalPinjam++;
            totalDenda += p.denda;

            if (p.terlambat > 0) {
                totalTerlambat++;
            }
        }
    }

    void tampilLaporan () {
        
    }
}
