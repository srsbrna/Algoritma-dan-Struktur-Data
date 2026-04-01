public class DataDosen25 {
    Dosen25[] dataDosen = new Dosen25[10];
    int idx = 0;

    void tambah(Dosen25 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh");
        }
    }
    void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen belum tersedia");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen25 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data sudah diurutkan berdasarkan usia dari termuda ke tertua");
    }
    void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen25 temp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = temp; 
        }
        System.out.println("Data sudah diurutkan berdasarkan usia dari tertua ke termuda");
    }
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen25 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data sudah diurutkan menggunakan insertion sort dari tertua ke termuda");
    }
}