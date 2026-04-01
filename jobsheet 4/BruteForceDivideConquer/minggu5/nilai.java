public class nilai {
   static int maxUTS(int arr[], int l, int r){
    if(l==r){
        return arr[l];
    }
    int mid = (l+r)/2;

    int maxKiri = maxUTS(arr, l, mid);
    int maxKanan = maxUTS(arr, mid+1, r);
    return Math.max(maxKiri,maxKanan);
   }

   static int minUTS(int arr[], int l, int r){
    if(l==r){
        return arr[l];
    }
    int mid = (l+r)/2;

    int minKiri = minUTS(arr, l, mid);
    int minKanan = minUTS(arr, mid+1, r);
    return Math.min(minKiri, minKanan);
   }
   
   static double rataUAS(int arr[]){
    int total = 0;

    for (int i = 0; i < arr.length; i++) {
        total += arr[i];
    }

    return (double) total/arr.length;
   }

   public class mainNilai {
    public static void main(String[] args) {
        
        int uts[]={78,85,90,76,92,88,80,82};
        int uas[]={82,88,87,79,95,85,83,84};

        System.out.println("UTS tertinggi : " + maxUTS(uts,0,uts.length-1));
        System.out.println("UTS terendah  : " + minUTS(uts,0,uts.length-1));
        System.out.println("Rata-rata UAS : " + rataUAS(uas));
    }
}
}
