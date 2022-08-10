import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x = in.nextInt();
        if (x % 4 == 0) {
            if (x%100==0){
                if(x%400==0) System.out.println("366");
                else System.out.println("365");
            }
            else System.out.println("366");
        } else System.out.println("365");
    }
}
