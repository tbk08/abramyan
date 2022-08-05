import java.util.Scanner;

public class Begin13 {
    static double PI=3.14;
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("R1=");
        int r1=in.nextInt();
        System.out.print("R2=");
        int r2=in.nextInt();
        double s[]=new double[3];
        if(r1>r2){
            s[0]=PI*r1*r1;
            s[1]=PI*r2*r2;
            s[2]=s[0]-s[1];
        }
        else System.out.println("Wrong data");
        for (double i:s
             ) {
            System.out.println(i);
        }

    }
}
