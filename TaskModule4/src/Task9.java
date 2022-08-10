import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        if(a>b){
            a=a+b;
            b=a-b;
            a=a-b;
        }
        System.out.println("A="+a+" B="+b);
    }
}
