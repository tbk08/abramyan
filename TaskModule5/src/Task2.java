import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("�����=");
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("�����");
                break;
            case 2:
                System.out.println("�������������������");
                break;
            case 3:
                System.out.println("�����������������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("�������");
                break;
            default:
                System.out.println("������");
        }
    }
}
