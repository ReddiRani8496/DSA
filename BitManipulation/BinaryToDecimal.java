import java.util.Scanner;

public class BinaryToDecimal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int res=0;
        int base=1;
        for(int i=num.length()-1;i>-1;i--) {
            if(num.charAt(i)=='1')
                res+=base;
            base *= 2;
        }
        System.out.println(res);
    }
}
