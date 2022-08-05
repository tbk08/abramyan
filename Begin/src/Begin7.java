import java.util.Scanner;

public class Begin7 {
    static double PI=3.14;
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("r=");
        int r=in.nextInt();
        final double L=2*PI*r;
        System.out.println("L="+L);
        final double S=PI*r*r;
        System.out.println("S="+S);
    }
}
