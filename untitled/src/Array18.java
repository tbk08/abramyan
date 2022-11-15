import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[9]) {
                System.out.println(a[i]);
                k++;
            }
        }
        if (k == 0) System.out.println(k);

    }
}
