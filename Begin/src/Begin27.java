import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a=in.nextInt();//2
        int b=a;//2
        System.out.println("A^2="+b);
        a=b*a;
        b=b*a;
        System.out.println("A^4="+b);
        a=a*b;
        b=b*a;
        System.out.println("A^8="+b);

    }
}
