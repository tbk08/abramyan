import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �����:");
        int n = in.nextInt();
        switch (n / 100) {
            case 1:
                System.out.print("��� ");
                break;
            case 2:
                System.out.print("������ ");
                break;
            case 3:
                System.out.print("������ ");
                break;
            case 4:
                System.out.print("��������� ");
                break;
            case 5:
                System.out.print("������� ");
                break;
            case 6:
                System.out.print("�������� ");
                break;
            case 7:
                System.out.print("������� ");
                break;
            case 8:
                System.out.print("��������� ");
                break;
            case 9:
                System.out.print("��������� ");
                break;
        }
        if (n % 10 <= 20) {
            switch (n % 10) {
                case 10:
                    System.out.println("������");
                    break;
                case 11:
                    System.out.println("����������");
                    break;
                case 12:
                    System.out.println("���������");
                    break;
                case 13:
                    System.out.println("����������");
                    break;
                case 14:
                    System.out.println("�����������");
                    break;
                case 15:
                    System.out.println("�����������");
                    break;
                case 16:
                    System.out.println("�����������");
                    break;
                case 17:
                    System.out.println("�����������");
                    break;
                case 18:
                    System.out.println("�������������");
                    break;
                case 19:
                    System.out.println("������������");
                    break;
                case 20:
                    System.out.println("��������");
                    break;
            }
        }
        switch ((n / 10) % 10) {
            case 2:
                System.out.print("�������� ");
                break;
            case 3:
                System.out.print("�������� ");
                break;
            case 4:
                System.out.print("����� ");
                break;
            case 5:
                System.out.print("��������� ");
                break;
            case 6:
                System.out.print("���������� ");
                break;
            case 7:
                System.out.print("��������� ");
                break;
            case 8:
                System.out.print("���������� ");
                break;
            case 9:
                System.out.print("��������� ");
                break;
        }
        switch (n % 10) {
            case 1:
                System.out.print("����");
                break;
            case 2:
                System.out.print("���");
                break;
            case 3:
                System.out.print("���");
                break;
            case 4:
                System.out.print("������");
                break;
            case 5:
                System.out.print("����");
                break;
            case 6:
                System.out.print("�����");
                break;
            case 7:
                System.out.print("����");
                break;
            case 8:
                System.out.print("������");
                break;
            case 9:
                System.out.print("������");
                break;

        }
    }
}
