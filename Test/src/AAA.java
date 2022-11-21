import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Side");
        String s = in.nextLine();
        System.out.print("N=");
        int n=in.nextInt();

        switch (s.charAt(0)){
            case 'N':
                if(n==1){
                    System.out.println("W");
                } else if (n==-1) {
                    System.out.println("E");
                } else if (n==0) {
                    System.out.println("N");
                }
                break;

            case 'W':
                if(n==1){
                    System.out.println("S ");
                }
        }
    }
}
