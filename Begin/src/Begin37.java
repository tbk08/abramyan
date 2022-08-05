import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Speed car1:");
        int v1=in.nextInt();
        System.out.print("Speed car1:");
        int v2=in.nextInt();
        System.out.print("S:");
        int s=in.nextInt();
        System.out.print("Time:");
        int t=in.nextInt();
        int s2=v1*t+v2*t;
        System.out.println("Distance:"+(s-s2));
    }
}
