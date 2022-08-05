import java.util.Scanner;

public class Begin25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x= in.nextInt();
        int y;
        y= (int) (3*Math.pow(x,6)-6*x*x-7);
        System.out.println("y="+y);
    }
}
