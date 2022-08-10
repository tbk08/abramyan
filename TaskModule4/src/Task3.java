import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number=");
        int n = in.nextInt();
        if(n>0){
            n++;
            System.out.println(n);
        }
        else if(n<0){
            n=n-2;
            System.out.println(n);
        } else if (n==0) {
            n=10;
            System.out.println(n);
        }
    }
}
