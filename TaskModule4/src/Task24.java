import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        double x = in.nextDouble();
        double f=0;
        if(x>0){
            f=2*Math.sin(x);
        }
        else f=6-x;
        System.out.println("f="+f);
    }
}
