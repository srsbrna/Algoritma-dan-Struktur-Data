public class nodePesanan {
    int nomorAntrean;
    pembeli pembeli;
    pesanan data;
    nodePesanan prev, next;

    public nodePesanan(nodePesanan prev,
                       int nomorAntrean,
                       pembeli pembeli,
                       pesanan data,
                       nodePesanan next) {
        this.prev = prev;
        this.nomorAntrean = nomorAntrean;
        this.pembeli = pembeli;
        this.data = data;
        this.next = next;
    }
}
