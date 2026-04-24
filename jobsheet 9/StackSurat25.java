public class StackSurat25 {
    Surat25[] stack;
    int top;
    int size;

    public StackSurat25(int size) {
        this.size = size;
        stack = new Surat25[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat25 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat25 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat25 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

    public boolean cari(String nama) {
    for (int i = 0; i <= top; i++) {
        if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
            System.out.println("Surat ditemukan:");
            System.out.println("ID: " + stack[i].idSurat);
            System.out.println("Nama: " + stack[i].namaMahasiswa);
            System.out.println("Kelas: " + stack[i].kelas);
            System.out.println("Jenis: " + stack[i].jenisIzin);
            System.out.println("Durasi: " + stack[i].durasi);
            return true;
        }
    }
    return false;
}
}