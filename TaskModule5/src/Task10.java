import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ:");
        String s = in.nextLine();
        System.out.print("Введите число:");
        int n = in.nextInt();
        switch (s) {
            case "С":
                if (n == 0) System.out.println("C");
                else if (n == 1) System.out.println("З");
                else if (n == -1) System.out.println("B");
                break;
            case "В":
                if (n == 0) System.out  .println("B");
                else if (n == 1) System.out.println("C");
                else if (n == -1) System.out.println("Ю");
                break;
            case "Ю":
                if (n == 0) System.out.println("Ю");
                else if (n == 1) System.out.println("В");
                else if (n == -1) System.out.println("З");
                break;
            case "З":
                if (n == 0) System.out.println("З");
                else if (n == 1) System.out.println("Ю");
                else if (n == -1) System.out.println("С");
                break;
        }
    }
}
