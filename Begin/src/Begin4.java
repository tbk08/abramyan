import java.util.Scanner;

public class Begin4 {
    static double PI=3.14;
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("d=");
        int d=in.nextInt();
        final double L=PI*d;
        System.out.println("L="+L);
    }
}
