import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number=");
        int n = in.nextInt();
        System.out.print("Number=");
        int n2 = in.nextInt();
        if(n>n2)
            System.out.println(n);
        else System.out.println(n2);
    }
}
