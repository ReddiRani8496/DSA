import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String str = "abbcad";
        char ch = firstNonRepeatingChar(str);
        System.out.println(ch);
    }

    public static char firstNonRepeatingChar(String str) {

        HashMap<Character,Integer> map = new HashMap<>();
        var chars = str.toCharArray();

        for(var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch,count+1);
        }

        for (var ch : chars)
           if(map.get(ch)==1)
               return ch;
               
        return Character.MIN_VALUE;
    }
}

