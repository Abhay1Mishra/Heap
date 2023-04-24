public class HeapSort {
    public static void main(String[] args) {
        int[] a = new int[]{10, 30, 50, 20, 35, 15};
        int n = a.length;

        heapSort(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }


    private static void heapify(int[] a, int n, int i) {
        int large = i;
        int l = 2 * i;
        int r = 2 * i + 1;
        if (l <= n && a[large] < a[l]) {
            large = l;
        }
        if (r <= n && a[large] < a[r]) {
            large = r;
        }
        if (large != i) {
            int temp = a[i];
            a[i] = a[large];
            a[large] = temp;
            heapify(a, n, large);
        }
    }

    public static void heapSort(int[] a, int n) {
        for (int i = n - 1; i >= 1; i--) {
            int temp = a[1];
            a[1] = a[i];
            a[i] = temp;
            heapify(a, i - 1, 1);
        }
    }


}
