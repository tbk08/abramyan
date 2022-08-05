import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("A=");
        int a=in.nextInt();
        System.out.print("B=");
        int b=in.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}
