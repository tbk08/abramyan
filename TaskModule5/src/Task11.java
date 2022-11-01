import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ:");
        String s = in.nextLine();
        System.out.print("Введите 1 число:");
        int n1 = in.nextInt();
        System.out.print("Введите 2 число:");
        int n2 = in.nextInt();

        switch (s) {
            case "С":
                switch (n1 + n2) {
                    case 0:
                    case 4:
                        System.out.println("C");
                        break;
                    case 2:
                    case -2:
                        System.out.println("Ю");
                        break;
                    case 1:
                        System.out.println("З");
                        break;
                    case 3:
                        System.out.println("В");
                        break;
                }
                break;
            case "В":
                switch (n1 + n2) {
                    case 0:
                    case 4:
                        System.out.println("B");
                        break;
                    case 2:
                    case -2:
                        System.out.println("З");
                        break;
                    case 1:
                        System.out.println("C");
                        break;
                    case 3:
                        System.out.println("Ю");
                        break;
                }
                break;
            case "Ю":
                switch (n1 +  n2) {
                    case 0:
                    case 4:
                        System.out.println("Ю");
                        break;
                    case 2:
                    case -2:
                        System.out.println("С");
                        break;
                    case 1:
                        System.out.println("В");
                        break;
                    case 3:
                        System.out.println("З");
                        break;
                }
                break;
            case "З":
                switch (n1 + n2) {
                    case 0:
                    case 4:
                        System.out.println("З");
                        break;
                    case 2:
                    case -2:
                        System.out.println("В");
                        break;
                    case 1:
                        System.out.println("Ю");
                        break;
                    case 3:
                        System.out.println("С");
                        break;
                }
                break;
        }
    }
}
