import java.util.Scanner;

public class Begin38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a=in.nextInt();
        System.out.print("B=");
        int b=in.nextInt();
        int x;
        if (a!=0&&b!=0){
            x=b/a;
            System.out.println("x="+x);
        }
        else System.out.println("Wrong data");

    }

}
