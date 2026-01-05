import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permutationOfString(str, "");
    }
      public static void permutationOfString(String str, String ans) {
        if(str.isEmpty()) {
            System.out.println(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++) {
            permutationOfString( str.substring(0,i) + str.substring(i+1), ans + str.charAt(i));
        }
    }
}
