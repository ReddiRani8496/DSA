package Revision;

public class StringPermutations {
    public static void main(String[] args) {
        String str ="abc";
        int n = str.length();
        int f = factorial(n);

        for (int i = 0; i < f; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(str);
            for (int j = n; j >= 1; j--) {
                int q = temp/j;
                int r = temp %j;
                System.out.print(sb.charAt(r)+" ");
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }

int factorial(int n) {

    int fact = 1;

    for (int i = 2; i <= n; i++) {
        fact*=i;
    }

    return fact;  
}
}

