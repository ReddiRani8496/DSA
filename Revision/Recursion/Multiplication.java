import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println( multiply(n,m));
    }

    private static int multiply(int n, int m) {
        if(m==0 || n==0)
            return 0;
        return n+multiply(n,m-1);
    }
}
