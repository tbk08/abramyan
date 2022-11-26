public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {3, 1, 2, 4, 8, 7, 5, 6};

        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
