import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("D=");
        int d = in.nextInt();
        System.out.print("M=");
        int m = in.nextInt();

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d == 31) {
                    d = 1;
                    if (m != 12) m = m + 1;
                    else m = 1;
                } else {
                    d = d + 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (d == 30) {
                    d = 1;
                    m = m + 1;
                } else {
                    d = d + 1;
                }
                break;
            case 2:
                if (d == 28) {
                    d = d + 1;
                    m = m + 1;
                } else {
                    d = d + 1;
                }
                break;
        }
        System.out.println("D="+d+" M="+m);
    }
}
