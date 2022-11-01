import java.util.Scanner;

public class Task13 {
    //for 19
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n=in.nextInt();
        int p=1;
        for (int i = 1; i <=n ; i++) {
            p=p*i;
        }
        System.out.println(p);
    }

}
