import java.util.Scanner;

import static java.lang.Math.abs;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        System.out.print("C=");
        int c = in.nextInt();
        if (abs(a - c) > abs(a - b)) System.out.println(c + " Mod=" + abs(a - c));
        else System.out.println(b + " Mod=" + abs(a - b));
    }
}
