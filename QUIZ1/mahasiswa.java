class mahasiswa {
    String nim;
    String nama;
    buku[] bukuDipinjam;
    int jumlahPinjam;

    public mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        bukuDipinjam = new buku[2];
        jumlahPinjam = 0;
    }

    boolean pinjamBuku(buku Buku) {
        if (jumlahPinjam >= 2) {
            System.out.println(nama + "sudah meminjam 2 buku.");
            return false;
        }

        bukuDipinjam[jumlahPinjam] = Buku;
        jumlahPinjam++;
        return true;
    }

    boolean kembalikanBuku(String kodeBuku) {
        for (int i=0; i < jumlahPinjam; i++){
            if (bukuDipinjam[i].kodeBuku.equalsIgnoreCase(kodeBuku)) {
                bukuDipinjam[i] = bukuDipinjam[jumlahPinjam - 1];
                bukuDipinjam[jumlahPinjam - 1] = null;
                jumlahPinjam--;
                return true;
            }
        }
        return false;
    }

    void tampilkanPinjaman() {
        if (jumlahPinjam == 0) return;

        System.out.println(nama + "meminjam: ");
        for (int i=0; i <jumlahPinjam; i++) {
            System.out.println(bukuDipinjam[i].judul + "");
        }

        System.out.println();
    }
}