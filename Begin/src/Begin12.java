import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("a=");
        int a=in.nextInt();
        System.out.print("b=");
        int b=in.nextInt();
        double c=Math.sqrt(a*a+b*b);
        double p=a+b+c;
        System.out.println("c="+c);
        System.out.println("P="+p);

    }
}
