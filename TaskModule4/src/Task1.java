import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number=");
        int n = in.nextInt();
        if(n>0){
            n++;
            System.out.println(n);
        }
        else System.out.println(n);
    }
}
