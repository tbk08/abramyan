import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 Number=");
        int a = in.nextInt();
        System.out.print("2 Number=");
        int b = in.nextInt();
        System.out.print("3 Number=");
        int c = in.nextInt();
        if(a>b&&a>c){
            System.out.println(a);
            if(b>c) System.out.println(c);
            else System.out.println(b);
        } else if(b>a&&b>c){
            System.out.println(b);
            if(a>c) System.out.println(c);
            else System.out.println(a);
        }else if(c>b&&c>a){
            System.out.println(c);
            if(b>a) System.out.println(a);
            else System.out.println(b);
        }
    }
}
