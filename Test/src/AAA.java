import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        int n = 0;
        /*
           A=2
           B=5
           2*2=4
           3*3=9
           4*4=16
           5*5=25
           4+16+9+25=bfssg

           120
         */
        for (int i = a; i <= b; i++) {
            System.out.println(i);
            n++;
        }
        System.out.println("N=" + n);

    }
}
