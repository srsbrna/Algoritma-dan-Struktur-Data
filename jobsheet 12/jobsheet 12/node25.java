public class node25 {
    mahasiswa25 data;
    node25 prev;
    node25 next;

    public node25(node25 prev, mahasiswa25 data, node25 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}