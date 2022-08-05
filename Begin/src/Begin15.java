import java.util.Scanner;

public class Begin15 {
    static double PI=3.14;
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("S=");
        int s=in.nextInt();
        int r= (int) Math.sqrt(s/3.14);
        int d=r*2;
        int l=(int) (PI*d);
        System.out.println("L="+l);
        System.out.println("D="+d);


    }
}
