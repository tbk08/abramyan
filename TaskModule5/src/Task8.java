import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("D=");
        int d = in.nextInt();
        System.out.print("M=");
        int m = in.nextInt();
        d = d - 1;
        if (d == 0) {
            d = 1;
            m = m - 1;
            if (m == 0) {
                m = 12;
            }
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    d = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    d = 30;
                    break;
                case 2:
                    d = 28;
                    break;
            }
        }
        System.out.println("D=" + d + " M=" + m);
    }
}
