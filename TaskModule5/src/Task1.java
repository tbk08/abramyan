import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число=");
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("case 1");break;
            default:
                System.out.println("def");
        }
    }
}
