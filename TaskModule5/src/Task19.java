import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        switch (year % 10) {
            case 0:
            case 1:
                System.out.print("white");
                break;
            case 2:
            case 3:
                System.out.print("black");
                break;
            case 4:
            case 5:
                System.out.print("green");
                break;
            case 6:
            case 7:
                System.out.print("red");
                break;
            case 8:
            case 9:
                System.out.print("yellow");
                break;
        }
        switch ((year+8)%12) {
            case 0:
                System.out.print(" rat");
                break;
            case 1:
                System.out.print(" cow");
                break;
            case 2:
                System.out.print(" tiger");
                break;
            case 3:
                System.out.print(" rabbit");
                break;
            case 4:
                System.out.print(" dragon");
                break;
            case 5:
                System.out.print(" snake");
                break;
            case 6:
                System.out.print(" horse");
                break;
            case 7:
                System.out.print(" sheep");
                break;
            case 8:
                System.out.print(" monkey");
                break;
            case 9:
                System.out.print(" chicken");
                break;
            case 10:
                System.out.print(" dog");
                break;
            case 11:
                System.out.print(" pig");
                break;
        }
        System.out.println(" year");
    }
}
