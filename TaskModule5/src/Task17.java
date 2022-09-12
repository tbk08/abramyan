import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество учебных заданий:");
        int n = in.nextInt();
        if (n <= 20) {
            switch (n) {
                case 10:
                    System.out.println("Десять учебных заданий");
                    break;
                case 11:
                    System.out.println("Одиннацать учебных заданий");
                    break;
                case 12:
                    System.out.println("Двенацать учебных заданий");
                    break;
                case 13:
                    System.out.println("Тринадцать учебных заданий");
                    break;
                case 14:
                    System.out.println("Четырначать учебных заданий");
                    break;
                case 15:
                    System.out.println("Пятьнадцать учебных заданий");
                    break;
                case 16:
                    System.out.println("Шестнадцать учебных заданий");
                    break;
                case 17:
                    System.out.println("Семьнадцать учебных заданий");
                    break;
                case 18:
                    System.out.println("Восемьнадцать учебных заданий");
                    break;
                case 19:
                    System.out.println("Девятнадцать учебных заданий");
                    break;
                case 20:
                    System.out.println("Двадцать учебных заданий");
                    break;

            }
        } else if (n > 20) {

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
                    System.out.print("одно учебное задание");break;
                case 2:
                    System.out.print("два учебных задания");
                    break;
                case 3:
                    System.out.print("три учебных задания");
                    break;
                case 4:
                    System.out.print("четыре учебных задания");
                    break;
                case 5:
                    System.out.print("пять учебных задания");
                    break;
                case 6:
                    System.out.print("шесть учебных задания");
                    break;
                case 7:
                    System.out.print("семь учебных задания");
                    break;
                case 8:
                    System.out.print("восемь учебных задания");
                    break;
                case 9:
                    System.out.print("девять учебных задания");
                    break;

            }
        }
    }
}


