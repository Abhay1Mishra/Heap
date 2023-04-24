public class Delete {
    public static void main(String[] args) {
        int[] a = new int[]{50,40,45,30,20,35,10};
        int n =a.length;
        Deletion(a,n);
        for (int i =0;i<n-1;i++){
            System.out.println(a[i]+ " ");
        }
    }

    private static void Deletion(int[] a, int n) {
        a[1] =a[n-1];
        n =n-1;
        int i =0;
        while (n>i){
            int l =a[2*i];
            int r =a[2*i+1];
            int large = l>r? 2*i:2*i+1;
            if(a[i]<a[large]){
                int temp = a[i];
                a[i] = a[large];
                a[large] =temp;
                i =large;
            }
            else
                return;
        }
    }
}
