import java.util.Scanner;

public class CountOfSetBits1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n!=0) {
            n = n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}
