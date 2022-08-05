import java.util.Scanner;

public class Begin14 {
static double PI=3.14;
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.print("L=");
    int l=in.nextInt();
    int r= (int) ((l/2)/PI);
    int s=(int)(PI*r*r);

    }
}
