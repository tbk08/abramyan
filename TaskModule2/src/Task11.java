import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number=");
        int n = in.nextInt();
        int x;
        x=(n%10)+((n/10)%10)+(n/100);
        System.out.println("Sum="+x);
        x=(n%10)*((n/10)%10)*(n/100);
        System.out.println("Digit="+x);
    }
}
