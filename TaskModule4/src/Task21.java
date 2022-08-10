import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        if(a==0&&b==0) System.out.println("0");
        if(a!=0&&b==0) System.out.println("1");
        if(a==0&&b!=0) System.out.println("2");
        if(a!=0&&b!=0) System.out.println("3");

    }
}
