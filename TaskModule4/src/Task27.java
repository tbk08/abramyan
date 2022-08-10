import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        double x = in.nextDouble();
        double f=0;
        if(x<0) x=0;
        if((int)x%2==0) f=1;
        if((int)x%2==1) f=-1;
        System.out.println("f(x)="+f);
    }
}
