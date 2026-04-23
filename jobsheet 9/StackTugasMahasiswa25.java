public class StackTugasMahasiswa25 {
    Mahasiswa25[] stack;
    int size;
    int top;

    public StackTugasMahasiswa25(int size) {
        this.size = size;
        stack = new Mahasiswa25[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa25 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Mahasiswa25 pop() {
        if (!isEmpty()) {
            Mahasiswa25 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Mahasiswa25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + " - " + stack[i].nim);
        }
    }
}