import java.util.Scanner;

public class Begin34 { public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Kg=");
    int x=in.nextInt();
    System.out.print("Price:");
    int a=in.nextInt();
    System.out.print("Kg=");
    int y=in.nextInt();
    System.out.print("Price:");
    int x1=in.nextInt();
    int kg=a/x;
    int kg2=x1/y;
    System.out.println("Frist price: "+kg);
    System.out.println("Second price: "+kg2);
    System.out.println("Difference in price: "+(kg/kg2));
}
}
