import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        double x = in.nextDouble();
        double f=0;
        if(x<-2||x>2){
            f=2*x;
        }
        else f=(-3)*x;
        System.out.println("f(x)="+f);
    }
}
