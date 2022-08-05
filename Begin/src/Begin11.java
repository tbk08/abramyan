import java.util.Scanner;

public class Begin11 {  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.print("a=");
    int a=in.nextInt();
    System.out.print("b=");
    int b=in.nextInt();

    int x[]=new int[4];
    x[0]=Math.abs(a+b);
    x[1]=Math.abs(a-b);
    x[2]=Math.abs(a*b);
    x[3]=Math.abs(a/b);
    for (int i:x
    ) {
        System.out.println(i);
    }
}
}
