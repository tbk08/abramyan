import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        for (int i = a; i <=b; i++) {//1
            for (int j = a; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
