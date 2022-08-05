import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("a=");
        int a=in.nextInt();
        System.out.print("b=");
        int b=in.nextInt();
        final int P=2*(a+b);
        final int S=b*a;
        System.out.println("P="+P);
        System.out.println("S="+S);
    }
}
