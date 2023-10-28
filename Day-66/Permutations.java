import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();

        int length = str.length();
        int required=2;
        System.out.println(subPairs(length,required));
        System.out.println(permutations(length));
    }
    public static int permutations(int length) {
        int total=1;
        for(int i=length;i>=1;i--)
            total*=i;
        return total;
    }
    public static int subPairs(int length,int required) {
        int total=1;
        for(int i=length;i>=1;i--)
            total*=i;
        int sub = length-required;
        int subTotal=1;
        for(int i=sub;i>=1;i--)
            subTotal*=i;
        return total/subTotal;
    }
}
