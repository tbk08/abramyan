import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();//2
        int b = in.nextInt();
        int c = in.nextInt();
        int k=0;// 0> sandi
        int l=0;//
        if(a>0) k++;
        else if(a<0) l++;
        if(b>0) k++;
        else if(b<0) l++;
        if(c>0) k++;
        else if(c< 0) l++;

        System.out.println("0> sanlardin sani "+k);
        System.out.println("<0 sanlardin sani "+l);
//        int b = a * a;//a^2
//        System.out.println("A^2=" + b);
//        a = b * b;//a^2*a^2
//        System.out.println("A^4=" + a);
//        b = a * a;//a^4*a^4
//        System.out.println("A^8=" + b);

    }
}
