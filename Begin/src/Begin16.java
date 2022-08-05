import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1=");
        int x1=in.nextInt();
        System.out.print("x2=");
        int x2=in.nextInt();
        int mod=Math.abs(x1-x2);
        System.out.println("Растояние "+mod);
    }
}
