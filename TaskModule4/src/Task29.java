import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x = in.nextInt();
        if(x==0) System.out.println("������� �����");
        if(x>0){
            if(x%2==0) System.out.println("������������� ������ �����");
            if(x%2!=0) System.out.println("������������� ������ �����");
        }
        if(x<0){
            if(x%2==0) System.out.println("������������� ������ �����");
            if(x%2!=0) System.out.println("������������� ������ �����");
        }
    }
}
