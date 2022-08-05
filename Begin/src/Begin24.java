import java.util.Scanner;

public class Begin24 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("A=");
        int a=in.nextInt();
        System.out.print("B=");
        int b=in.nextInt();
        System.out.print("C=");
        int c=in.nextInt();
        b=a+b+c;
        a=b-a-c;
        c=b-a-c;
        b=b-a-c;
        System.out.println("A="+a);
        System.out.println("B="+b);
        System.out.print("C="+c);
    }
}
