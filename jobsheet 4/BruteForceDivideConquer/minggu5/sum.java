package minggu5;

public class sum {
    double keuntungan[];
    int elemen;

    public sum(int elemen){
        this.elemen = elemen;
        keuntungan = new double[elemen];
    }

    double totalBf(){
        double total=0;
        for (int i=0; i<keuntungan.length;i++){
            total = total+keuntungan[i];
        }
        return total;
    }

    double totalDc(double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        }

        int mid = (l+r)/2;
        double lsum = totalDc(arr, l, mid);
        double rsum = totalDc(arr, mid+1, r);
        return lsum+rsum;
    }
}
