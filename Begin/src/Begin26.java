import java.util.Scanner;

public class Begin26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x= in.nextInt();
        int y;
        y= (int) (4*Math.pow((x-3),6)-7*Math.pow((x-3),3)+2);
        System.out.println("y="+y);
    }
}
