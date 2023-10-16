import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {
    
    public static void main(String[] args) {
        
        String str = "abcdab";
        char ch = firstRepeatingChar(str);
        System.out.println(ch);
    }

    private static char firstRepeatingChar(String str) {
        
        Set<Character> set = new HashSet<>();
        var chars = str.toCharArray();
        
        for(var x : chars) {
            if(set.contains(x))
                return x;
            set.add(x);
        }
        
        return Character.MIN_VALUE;
    }

}
