import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1=");
        int x1=in.nextInt();
        System.out.print("y1=");
        int y1=in.nextInt();
        System.out.print("x2=");
        int x2=in.nextInt();
        System.out.print("y2=");
        int y2=in.nextInt();
        System.out.print("x3=");
        int x3=in.nextInt();
        System.out.print("x1=");
        int y3=in.nextInt();

        int a,b,c;
        a=(int) Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        b=(int) Math.sqrt((Math.pow((x3-x2),2))+(Math.pow((y3-y2),2)));
        c=(int) Math.sqrt((Math.pow((x3-x1),2))+(Math.pow((y3-y1),2)));

        int s,p;
        p=(a+b+c)/2;
        s=(int) Math.sqrt((p*(p-a)*(p-b)*(p-c)));

        System.out.println("S="+s);
        System.out.println("P="+p);

    }
}
