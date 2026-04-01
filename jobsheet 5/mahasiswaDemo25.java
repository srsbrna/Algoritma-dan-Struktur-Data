public class mahasiswaDemo25 {
    public static void main(String[] args) {
        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();
        mahasiswa25 m1 = new mahasiswa25("123", "Zidan", "2A", 3.2);
        mahasiswa25 m2 = new mahasiswa25("124", "Ayu", "2A", 3.5);
        mahasiswa25 m3 = new mahasiswa25("125", "Sofi", "2A", 3.1);
        mahasiswa25 m4 = new mahasiswa25("126", "Sita", "2A", 3.9);
        mahasiswa25 m5 = new mahasiswa25("127", "Miki", "2A", 3.7);
    
        list.tambah(m1);
        list.tambah(m2); 
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubblesort();
        list.tampil();
    }
}