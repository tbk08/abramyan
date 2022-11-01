import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        double s = 0, nk = 1;//3
        for (int i = 1; i <=n; i++) {//1
            for (int j = 1; j <=n-(i-1); j++) {
                nk = nk * i;//1 4
            }
            s = s + nk;//1+4+3
            nk = 1;
        }
        System.out.println(s);
    }
}
