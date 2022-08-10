import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 Number=");
        int n1 = in.nextInt();
        System.out.print("2 Number=");
        int n2 = in.nextInt();
        System.out.print("3 Number=");
        int n3 = in.nextInt();
        int k = 0;
        int x=0;
        if (n1 > 0) k++;
        else x++;
        if (n2 > 0) k++;
        else x++;
        if (n3 > 0) k++;
        else x++;
        System.out.println("+ numbers="+k);
        System.out.println("- numbers="+x);
    }
}
