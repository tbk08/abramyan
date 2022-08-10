import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        System.out.print("C=");
        int c = in.nextInt();
        if((a<b&&b<c)||(a>b&&b>c)){
            a=a*2;
            b=b*2;
            c=c*2;
        }
        else {
            a=a*(-1);
            b=b*(-1);
            c=c*(-1);
        }
        System.out.println("A="+a+" B="+b+" C="+c);
    }
}
