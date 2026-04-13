class peminjaman {
    mahasiswa mhs;
    buku buku;
    int lamaPinjam;
    int terlambat;
    int denda;

    peminjaman(mahasiswa mhs, buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int batas = 5;
        int dendaPerHari = 2000;

            if (lamaPinjam > batas) {
                terlambat = lamaPinjam - batas;
                denda = terlambat * dendaPerHari;
            } else {
                terlambat = 0;
                denda = 0;
            }
    }

    void tampil() {
        System.out.println(
            mhs.nama + " | " +
            buku.judul + " | " +
            "Lama: " + lamaPinjam + " | " +
            "Terlambat: " + terlambat + " | " +
            "Denda: " + denda
        );
    }
}