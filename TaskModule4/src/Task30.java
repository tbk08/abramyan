import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x = in.nextInt();
        if(x==0) System.out.println("������� �����");
        if(x%2==0){
            if(x<10) System.out.println("������ ����������� �����");
            if(x>9&&x<100) System.out.println("������ ����������� �����");
            if(x>99&&x<1000) System.out.println("������ ����������� �����");
        }
        if(x%2!=0){
            if(x<10) System.out.println("�������� ����������� �����");
            if(x>9&&x<100) System.out.println("�������� ����������� �����");
            if(x>99&&x<1000) System.out.println("�������� ����������� �����");
        }
    }
}
