public class MahasiswaBerprestasi25 {
    mahasiswa25 [] listMhs = new mahasiswa25[5];
    int idx;

    void tambah(mahasiswa25 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil() {
        for (mahasiswa25 m:listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------------");
        }
    }
    void bubblesort() {
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    mahasiswa25 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}