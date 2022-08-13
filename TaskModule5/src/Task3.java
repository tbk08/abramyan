import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число=");
        int n = in.nextInt();
        int l = 0;
        if (n == 12 || n == 1 || n == 2) {
            l = 1;
        }
        if (n == 3 || n == 4 || n == 5) {
            l = 2;
        }
        if (n == 6 || n == 7 || n == 8) {
            l = 3;
        }
        if (n == 9 || n == 10 || n == 11) {
            l = 4;
        }
        switch (l) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;

        }
    }
}
