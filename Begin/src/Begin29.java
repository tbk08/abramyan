import java.util.Scanner;

public class Begin29 {
    static double PI=3.14;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        int a=in.nextInt();
        double rad;
        if(0<a&&a<360){
             rad=(a*PI)/180;
            System.out.println(rad);
        }
        else System.out.println("Wrong data");
    }
}
