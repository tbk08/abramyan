import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число=");
        int n = in.nextInt();
        int l = 0;
        if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
            l = 1;
        }
        if (n == 4 || n == 6 || n == 9 || n == 11) {
            l = 2;
        }
        if (n == 2) {
            l = 3;
        }
        switch (l) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("30");
                break;
            case 3:
                System.out.println("28");
                break;

        }
    }
}
