import java.util.Scanner;

public class Begin9 { public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.print("a=");
    int a=in.nextInt();
    System.out.print("b=");
    int b=in.nextInt();
    double avg=Math.sqrt(a*b);
    System.out.println("Среднее арифметическое: "+avg);
}
}
