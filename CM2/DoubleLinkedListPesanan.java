public class DoubleLinkedListPesanan {
    nodePesanan head;
    nodePesanan tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int nomorAntrean, pembeli pembeli, pesanan pesanan) {
        nodePesanan newNode = new nodePesanan(
                tail,
                nomorAntrean,
                pembeli,
                pesanan,
                null
        );

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Pesanan berhasil disimpan.");
    }

    public void sortByNamaPesanan() {
        if (isEmpty() || head.next == null) {
            return;
        }

        boolean swapped;

        do {
            swapped = false;
            nodePesanan current = head;

            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(
                        current.next.data.namaPesanan) > 0) {

                            int tempNomor = current.nomorAntrean;
                    pembeli tempPembeli = current.pembeli;
                    pesanan tempPesanan = current.data;

                    current.nomorAntrean = current.next.nomorAntrean;
                    current.pembeli = current.next.pembeli;
                    current.data = current.next.data;

                    current.next.nomorAntrean = tempNomor;
                    current.next.pembeli = tempPembeli;
                    current.next.data = tempPesanan;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void printLaporan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        sortByNamaPesanan();

        System.out.println("\n=== LAPORAN PESANAN (URUT NAMA MENU) ===");
        System.out.println("Kode\tMenu\t\tHarga\tPembeli");

        int total = 0;
        nodePesanan current = head;

        while (current != null) {
            System.out.println(
                    current.data.kodePesanan + "\t" +
                    current.data.namaPesanan + "\t\t" +
                    current.data.harga + "\t" +
                    current.pembeli.namaPembeli
            );

            total += current.data.harga;
            current = current.next;
        }

        System.out.println("---------------------------------------");
        System.out.println("Total Pendapatan: Rp " + total);
    }

}
