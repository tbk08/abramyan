import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("a=");
        int a=in.nextInt();
        final int V=a*a*a;
        final int S=6*a*a;
        System.out.println("V="+V);
        System.out.println("S="+S);
    }
}
