public class DoubleLinkedListAntrean {
    nodeAntrean head;
    nodeAntrean tail;
    int nomorOtomatis = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(pembeli pembeli) {
        nodeAntrean newNode = new nodeAntrean(
                tail,
                nomorOtomatis++,
                pembeli,
                null
        );

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Data berhasil ditambahkan ke antrean.");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrean masih kosong.");
            return;
        }

        System.out.println("\n=== DAFTAR ANTREAN ===");
        System.out.println("No\tNama\t\tNo HP");

        nodeAntrean current = head;
        while (current != null) {
            System.out.println(
                    current.nomorAntrean + "\t" +
                    current.data.namaPembeli + "\t\t" +
                    current.data.noHp
            );
            current = current.next;
        }
    }

    public nodeAntrean removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return null;
        }

        nodeAntrean removed = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        removed.next = null;
        return removed;
    }

    public int size() {
        int count = 0;
        nodeAntrean current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
}
