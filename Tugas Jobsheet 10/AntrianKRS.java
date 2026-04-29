public class AntrianKRS {
    private Mahasiswa25[] antrian;
    private int front, rear, size;
    private int max = 10;
    private int totalDiproses = 0;
    private final int KAPASITAS_DPA = 30;

    public AntrianKRS() {
        antrian = new Mahasiswa25[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void kosongkanAntrian() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa25 mhs) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            antrian[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian.");
        } else {
            System.out.println("Antrian penuh! Maksimal 10 orang.");
        }
    }

    public void panggilAntrian() {
        if (size >= 2) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Memproses KRS: " + antrian[front]);
                front = (front + 1) % max;
                size--;
                totalDiproses++;
            }
        } else if (size == 1) {
            System.out.println("Hanya ada 1 Mahasiswa25. Memproses: " + antrian[front]);
            front = (front + 1) % max;
            size--;
            totalDiproses++;
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.print("Isi Antrian: ");
        int temp = front;
        for (int i = 0; i < size; i++) {
            System.out.print(antrian[temp] + " ");
            temp = (temp + 1) % max;
        }
        System.out.println();
    }

    public void tampilkanDepan() {
        if (size >= 2) {
            System.out.println("2 Antrian Terdepan: " + antrian[front] + " dan " + antrian[(front + 1) % max]);
        } else if (size == 1) {
            System.out.println("Hanya ada 1 di antrian: " + antrian[front]);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian paling akhir: " + antrian[rear]);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void cetakStatistik() {
        System.out.println("--- Statistik DPA ---");
        System.out.println("Jumlah dalam antrian saat ini: " + size);
        System.out.println("Mahasiswa25 sudah proses KRS: " + totalDiproses);
        int sisaKapasitas = KAPASITAS_DPA - totalDiproses;
        System.out.println("Sisa kuota DPA (Belum KRS): " + (sisaKapasitas < 0 ? 0 : sisaKapasitas));
    }
}
