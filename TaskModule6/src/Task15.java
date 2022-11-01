import java.util.Scanner;

public class Task15 {
    //for 36
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        System.out.print("K=");
        int k = in.nextInt();
//        double s = 0;
//        for (int i = 1; i <= n; i++) {
//                s = s + Math.pow(i, k);
//        }
//        System.out.println(s);
        double s = 0, nk=1;
        for (int i = 1; i <=n ; i++) {
            nk=1;
            for (int j = 1; j <=k ; j++) {
                nk=nk*i;
            }
            s=s+nk;
        }
        System.out.println(s);
    }
}
