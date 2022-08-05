import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("A=");
        int a=in.nextInt();
        System.out.print("B=");
        int b=in.nextInt();
        System.out.print("C=");
        int c=in.nextInt();
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println("A="+a);
        System.out.println("B="+b);
        System.out.print("C="+c);
    }
}
