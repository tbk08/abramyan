import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������:");
        String s = in.nextLine();
        System.out.print("������� �����:");
        int n = in.nextInt();
        switch (s) {
            case "�":
                if (n == 0) System.out.println("C");
                else if (n == 1) System.out.println("�");
                else if (n == -1) System.out.println("B");
                break;
            case "�":
                if (n == 0) System.out  .println("B");
                else if (n == 1) System.out.println("C");
                else if (n == -1) System.out.println("�");
                break;
            case "�":
                if (n == 0) System.out.println("�");
                else if (n == 1) System.out.println("�");
                else if (n == -1) System.out.println("�");
                break;
            case "�":
                if (n == 0) System.out.println("�");
                else if (n == 1) System.out.println("�");
                else if (n == -1) System.out.println("�");
                break;
        }
    }
}
