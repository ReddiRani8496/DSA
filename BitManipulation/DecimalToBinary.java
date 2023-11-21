package BitManipulation;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res ="";
        while (num>=1) {
            int rem = num%2;
            res = rem+res;
            num /=2;
        }
        System.out.println(res);
    }
}
