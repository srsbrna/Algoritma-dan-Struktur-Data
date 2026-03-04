class perpustakaan {
    buku[] daftarBuku = new buku[10];
    mahasiswa[] daftarMahasiswa = new mahasiswa[10];

    int jumlahBuku = 0;
    int jumlahMahasiswa = 0;

    void tambahBuku(buku Buku) {
        daftarBuku[jumlahBuku++] = Buku;
        System.out.println("Buku berhasil ditambahkan!");
    }

    void tambahMahasiswa(mahasiswa mhs) {
        daftarMahasiswa[jumlahMahasiswa++] = mhs;
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    buku cariBuku(String kode) {
        for (int i=0; i<jumlahBuku; i++) {
            if (daftarBuku[i].kodeBuku.equals(kode))
                return daftarBuku[i];
        }
        return null;
    };

    mahasiswa cariMahasiswa(String nim) {
        for (int i=0; i<jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].nim.equals(nim));
            return daftarMahasiswa[i];
        }
        return null;
    }

    void pinjamBuku(String nim, String kodeBuku) {
        mahasiswa m = cariMahasiswa(nim);
        buku b = cariBuku(kodeBuku);

        if (m == null || b == null) return;

        if (b.statusDipinjam) {
            System.out.println("Gagal meminjam buku: " + b.judul + " karena sudah dipinjam orang lain.");
            return;
        }

        if (m.pinjamBuku(b)) {
            b.statusDipinjam = true;
            System.out.println(m.nama + " berhasil meminjam " + b.judul);
        }
    }

    void kembalikanBuku(String nim, String kodeBuku) {
        mahasiswa m = cariMahasiswa(nim);
        buku b = cariBuku(kodeBuku);

        if (m != null && b != null && m.kembalikanBuku(kodeBuku)) {
            b.statusDipinjam = false;
            System.out.println(m.nama + " mengembalikan " + b.judul);
        }
    }

    void tampilkanPeminjaman() {
        System.out.println("\nDaftar Peminjaman Buku: ");
        for (int i=0; i<jumlahMahasiswa; i++) {
            daftarMahasiswa[i].tampilkanPinjaman();
        }
    }
}
