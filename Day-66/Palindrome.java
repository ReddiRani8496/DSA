import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        char ch[] = str.toCharArray();
        for(var x :ch) {
            if(map.containsKey(x)) {
                map.put(x,map.get(x)+1);
            }
            else
                map.put(x,1);
        }
      
        int odd=0;
        for(Map.Entry<Character,Integer> x : map.entrySet()) {
            if(x.getValue()%2!=0)
                odd++;
        }
        return odd == 0 || odd == 1;
    }
}

