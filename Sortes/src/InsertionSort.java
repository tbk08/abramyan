public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {3, 1, 5, 2, 4, 7, 8, 6};

        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }

    }
}
