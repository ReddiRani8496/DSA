import java.util.Scanner;

public class StringOfLenK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        stringsOfLenK(str,k,"");
    }

    private static void stringsOfLenK(String str, int k, String ans) {
        if(ans.length()==k) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            stringsOfLenK(str,k,ans+str.charAt(i));
        }
    }
}
