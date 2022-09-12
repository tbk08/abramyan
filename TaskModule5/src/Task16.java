import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст:");
        int n = in.nextInt();
        if (n % 10 == 0) {
            switch (n) {
                case 20:
                    System.out.println("Двадцать лет");
                    break;
                case 30:
                    System.out.println("Тридцать лет");
                    break;
                case 40:
                    System.out.println("Сорок лет");
                    break;
                case 50:
                    System.out.println("Пятьдесят лет");
                    break;
                case 60:
                    System.out.println("Шестьдесят лет");
                    break;
            }
        }
        switch (n / 10) {
            case 2:
                System.out.print("Двадцать ");
                break;
            case 3:
                System.out.print("Тридцать ");
                break;
            case 4:
                System.out.print("Сорок ");
                break;
            case 5:
                System.out.print("Пятьдесят ");
                break;
            case 6:
                System.out.print("Шестьдесят ");
                break;
        }
        switch (n % 10) {
            case 1:
                System.out.print("один год");
            case 2:
                System.out.print("два года");
                break;
            case 3:
                System.out.print("три год");
                break;
            case 4:
                System.out.print("четыре года");
                break;
            case 5:
                System.out.print("пять год");
                break;
            case 6:
                System.out.print("шесть года");
                break;
            case 7:
                System.out.print("семь год");
                break;
            case 8:
                System.out.print("восемь год");
                break;
            case 9:
                System.out.print("девять год");
                break;

        }
    }
}
