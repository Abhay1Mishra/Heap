public class Insert {
    public static void main(String[] args) {
        int[] a = new int[]{50,40,45,30,20,35,10};
        int n =a.length;
        int value = 60;
        insert(a,n,value);
        for (int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void insert(int[] a,int n,int value){
        n =n+1;
        a[n] =value;
        int i =n;
        while (i>1){
            int parent =i/2;
            if(a[parent]<a[i]){
                int temp = a[i];
                a[i] = a[parent];
                a[parent] = temp;

                i = parent;
            }else
                return;
        }
    }
}