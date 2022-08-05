import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Speed:");
        int v=in.nextInt();
        System.out.print("Speed of water:");
        int u=in.nextInt();
        System.out.print("Time lake:");
        int t1=in.nextInt();
        System.out.print("Time river:");
        int t2=in.nextInt();

        int s;
        s=t1*v;
        s=s+(v-u)*t2;
        System.out.print("S="+s);

    }
}
