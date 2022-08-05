import java.util.Scanner;

public class Begin8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("a=");
        int a=in.nextInt();
        System.out.print("b=");
        int b=in.nextInt();
        double avg=(a+b)/2;
        System.out.println("Среднее арифметическое: "+avg);
    }
}
