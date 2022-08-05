import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a=in.nextInt();
        System.out.print("B=");
        int b=in.nextInt();
        System.out.print("C=");
        int c=in.nextInt();
        double x,x2;
        int d;
        d=b*b-4*a*c;
        if (a!=0){
            x= ((-b+Math.sqrt(d))/(2*a));
            x2= ((-b-Math.sqrt(d))/(2*a));
            if(x>x2){
            System.out.println("x1="+x2);
            System.out.println("x2="+x);}
            else {
                System.out.println("x1="+x);
                System.out.println("x2="+x2);
            }
        }
        else System.out.println("Wrong data");
    }
}
