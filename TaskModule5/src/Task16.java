import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������:");
        int n = in.nextInt();
        if (n % 10 == 0) {
            switch (n) {
                case 20:
                    System.out.println("�������� ���");
                    break;
                case 30:
                    System.out.println("�������� ���");
                    break;
                case 40:
                    System.out.println("����� ���");
                    break;
                case 50:
                    System.out.println("��������� ���");
                    break;
                case 60:
                    System.out.println("���������� ���");
                    break;
            }
        }
        switch (n / 10) {
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
        }
        switch (n % 10) {
            case 1:
                System.out.print("���� ���");
            case 2:
                System.out.print("��� ����");
                break;
            case 3:
                System.out.print("��� ���");
                break;
            case 4:
                System.out.print("������ ����");
                break;
            case 5:
                System.out.print("���� ���");
                break;
            case 6:
                System.out.print("����� ����");
                break;
            case 7:
                System.out.print("���� ���");
                break;
            case 8:
                System.out.print("������ ���");
                break;
            case 9:
                System.out.print("������ ���");
                break;

        }
    }
}
