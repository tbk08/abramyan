import java.util.Scanner;

public class Begin18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a=in.nextInt();
        System.out.print("B=");
        int b=in.nextInt();
        System.out.print("C=");
        int c=in.nextInt();
        int ac=Math.abs(a-b);
        int bc=Math.abs(b-c);
        int sum=ac*bc;
        System.out.println("AB="+ac);
        System.out.println("BC="+bc);
        System.out.println("Sum="+sum);
    }
}
