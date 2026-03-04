class buku {
    String kodeBuku;
    String judul;
    String penulis;
    boolean statusDipinjam;

    buku(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.statusDipinjam = false;
    }

    void tampilkanInfo() {
        System.out.println(kodeBuku + " - " + judul + " (" + penulis + ")");
    }
}