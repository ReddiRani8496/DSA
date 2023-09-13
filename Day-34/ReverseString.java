import java.util.Stack;
public class ReverseString {
        public static String reverse(String input) {
            Stack<Character> stack = new Stack<>();

            for(var x : input.toCharArray())
                stack.push(x);
            StringBuilder sb = new StringBuilder();
            while (!stack.empty())
                sb.append(stack.pop());
            return sb.toString();
     }

}

