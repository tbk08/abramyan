import java.util.Scanner;

public class Array63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = {7, 9, 11, 13, 15};
        int b[] = {8, 10, 11, 14, 16};
        int c[] = new int[10];
/*
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("b[" + i + "]=");
            b[i] = in.nextInt();
        }
*/
        int ka=0,kb=0;

        for (int k=0; k<10; ++k){
            if ((ka>=5)||((a[ka]>b[kb])&&(kb<5) )) {
                c[k]=b[kb];
                ++kb;
            } else {
                c[k]=a[ka];
                ++ka;
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "]=" + c[i]);
        }

    }
}
