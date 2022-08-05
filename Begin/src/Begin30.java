import java.util.Scanner;

public class Begin30 {
    static double PI=3.14;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        int a=in.nextInt();
        double grad;
        if(0<a&&a<2*PI){
            grad=(a*180)/PI;
            System.out.println(grad);
        }
        else System.out.println("Wrong data");
    }
}
