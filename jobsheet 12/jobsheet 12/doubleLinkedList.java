
public class doubleLinkedList {
    node25 head;
    node25 tail;

    public doubleLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(mahasiswa25 data) {
        node25 newnode25 = new node25(null, data, null);
        if (isEmpty()) {
            head = tail = newnode25;
        } else {
            newnode25.next = head;
            head.prev = newnode25;
            head = newnode25;
        }
    }


    public void addLast(mahasiswa25 data) {
        node25 newnode25 = new node25(null, data, null);
        if (isEmpty()) {
            head = tail = newnode25;
        } else {
            tail.next = newnode25;
            newnode25.prev = tail;
            tail = newnode25;
        }
    }

    public node25 search(String nim) {
        node25 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(String keyNim, mahasiswa25 data) {
        node25 current = search(keyNim);

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        node25 newnode25 = new node25(current, data, current.next);

        if (current.next != null) {
            current.next.prev = newnode25;
        } else {
            tail = newnode25;
        }

        current.next = newnode25;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        node25 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("----------------------");
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        node25 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("----------------------");
            current = current.prev;
        }
    }

}
