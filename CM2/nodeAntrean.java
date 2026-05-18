public class nodeAntrean {
    int nomorAntrean;
    pembeli data;
    nodeAntrean prev, next;

    public nodeAntrean(nodeAntrean prev, int nomorAntrean,
                       pembeli data, nodeAntrean next) {
        this.prev = prev;
        this.nomorAntrean = nomorAntrean;
        this.data = data;
        this.next = next;
    }
}
