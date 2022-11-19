import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("D=");//d=1
        int d = in.nextInt();
        System.out.print("M=");//m=9
        int m = in.nextInt();
        d = d - 1;//d=1-1=0
        if (d == 0) {
            m = m - 1;//,=9-1=8
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
        //d=31 m = 8
        System.out.println("D=" + d + " M=" + m);
    }
}
