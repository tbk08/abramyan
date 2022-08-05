import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a=in.nextInt();//2
        int b=a;
        int c=b*a;
        System.out.println("A^2="+c);
        a=b*c;
        System.out.println("A^3="+a);
        b=c*a;
        System.out.println("A^5="+b);
        c=b*b;
        System.out.println("A^10="+c);
        a=b*c;
        System.out.println("A^15="+a);


    }
}
