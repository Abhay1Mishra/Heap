public class Heapify {
    public static void main(String[] args) {
        int[] a = new int[]{10, 30, 50, 20, 35, 15};
        int n = a.length;
        buildHeap(a, n);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void buildHeap(int[] a, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
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

}
