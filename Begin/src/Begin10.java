import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("a=");
        int a=in.nextInt();
        System.out.print("b=");
        int b=in.nextInt();
        int a1=a*a,b1=b*b;
        int x[]=new int[4];
        x[0]=a1+b1;
        x[1]=a1-b1;
        x[2]=a1*b1;
        x[3]=a1/b1;
        for (int i:x
             ) {
            System.out.println(i);
        }
    }
}
