import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������:");
        String s = in.nextLine();
        System.out.print("������� 1 �����:");
        int n1 = in.nextInt();
        System.out.print("������� 2 �����:");
        int n2 = in.nextInt();

        switch (s) {
            case "�":
                switch (n1 + n2) {
                    case 0:
                    case 4:
                        System.out.println("C");
                        break;
                    case 2:
                    case -2:
                        System.out.println("�");
                        break;
                    case 1:
                        System.out.println("�");
                        break;
                    case 3:
                        System.out.println("�");
                        break;
                }
                break;
            case "�":
                switch (n1 + n2) {
                    case 0:
                    case 4:
                        System.out.println("B");
                        break;
                    case 2:
                    case -2:
                        System.out.println("�");
                        break;
                    case 1:
                        System.out.println("C");
                        break;
                    case 3:
                        System.out.println("�");
                        break;
                }
                break;
            case "�":
                switch (n1 +  n2) {
                    case 0:
                    case 4:
                        System.out.println("�");
                        break;
                    case 2:
                    case -2:
                        System.out.println("�");
                        break;
                    case 1:
                        System.out.println("�");
                        break;
                    case 3:
                        System.out.println("�");
                        break;
                }
                break;
            case "�":
                switch (n1 + n2) {
                    case 0:
                    case 4:
                        System.out.println("�");
                        break;
                    case 2:
                    case -2:
                        System.out.println("�");
                        break;
                    case 1:
                        System.out.println("�");
                        break;
                    case 3:
                        System.out.println("�");
                        break;
                }
                break;
        }
    }
}
