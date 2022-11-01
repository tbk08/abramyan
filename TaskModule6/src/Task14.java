import java.util.Scanner;

public class Task14 {
    //for 20
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n=in.nextInt();
        int p=1,s=0;
        for (int i = 1; i <=n ; i++) {
            p=p*i;
            s=s+p;
        }
        System.out.println(p);
        System.out.println(s);
    }
}
