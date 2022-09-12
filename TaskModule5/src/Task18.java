import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int n = in.nextInt();
        switch (n / 100) {
            case 1:
                System.out.print("Сто ");
                break;
            case 2:
                System.out.print("Двести ");
                break;
            case 3:
                System.out.print("Триста ");
                break;
            case 4:
                System.out.print("Четыреста ");
                break;
            case 5:
                System.out.print("Пятьсот ");
                break;
            case 6:
                System.out.print("Шестьсот ");
                break;
            case 7:
                System.out.print("Семьсот ");
                break;
            case 8:
                System.out.print("Восемьсот ");
                break;
            case 9:
                System.out.print("Девятьсот ");
                break;
        }
        if (n % 10 <= 20) {
            switch (n % 10) {
                case 10:
                    System.out.println("десять");
                    break;
                case 11:
                    System.out.println("одиннацать");
                    break;
                case 12:
                    System.out.println("двенацать");
                    break;
                case 13:
                    System.out.println("тринадцать");
                    break;
                case 14:
                    System.out.println("четырначать");
                    break;
                case 15:
                    System.out.println("пятьнадцать");
                    break;
                case 16:
                    System.out.println("шестнадцать");
                    break;
                case 17:
                    System.out.println("семьнадцать");
                    break;
                case 18:
                    System.out.println("восемьнадцать");
                    break;
                case 19:
                    System.out.println("девятнадцать");
                    break;
                case 20:
                    System.out.println("двадцать");
                    break;
            }
        }
        switch ((n / 10) % 10) {
            case 2:
                System.out.print("двадцать ");
                break;
            case 3:
                System.out.print("тридцать ");
                break;
            case 4:
                System.out.print("сорок ");
                break;
            case 5:
                System.out.print("пятьдесят ");
                break;
            case 6:
                System.out.print("шестьдесят ");
                break;
            case 7:
                System.out.print("семьдесят ");
                break;
            case 8:
                System.out.print("восьмдесят ");
                break;
            case 9:
                System.out.print("девяносто ");
                break;
        }
        switch (n % 10) {
            case 1:
                System.out.print("один");
                break;
            case 2:
                System.out.print("два");
                break;
            case 3:
                System.out.print("три");
                break;
            case 4:
                System.out.print("четыре");
                break;
            case 5:
                System.out.print("пять");
                break;
            case 6:
                System.out.print("шесть");
                break;
            case 7:
                System.out.print("семь");
                break;
            case 8:
                System.out.print("восемь");
                break;
            case 9:
                System.out.print("девять");
                break;

        }
    }
}
