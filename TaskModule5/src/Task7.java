import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();

        switch (n) {
            case 1:
                System.out.println(n);
                break;
            case 2:
                System.out.println(n / 1000000);
                break;
            case 3:
                System.out.println(n / 1000);
                break;
            case 4:
                System.out.println(n * 1000);
                break;
            case 5:
                System.out.println(n * 100);
                break;
        }
    }
}
