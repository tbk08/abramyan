import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }

        int min=a[1];
        for (int i = 4; i < a.length; i+=2) {
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
