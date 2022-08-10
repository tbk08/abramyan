import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x = in.nextInt();
        if(x==0) System.out.println("Нулевое число");
        if(x%2==0){
            if(x<10) System.out.println("Четное однозначное число");
            if(x>9&&x<100) System.out.println("Четное двухзначное число");
            if(x>99&&x<1000) System.out.println("Четное трехзначное число");
        }
        if(x%2!=0){
            if(x<10) System.out.println("Нечетное однозначное число");
            if(x>9&&x<100) System.out.println("Нечетное двухзначное число");
            if(x>99&&x<1000) System.out.println("Нечетное трехзначное число");
        }
    }
}
