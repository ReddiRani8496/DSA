import java.util.Stack;

public class InfixToPostFix {
    public static void main(String[] args) {
        String infix = "a*b-(c+d)+e";
        String postfix = infixToPostfix(infix);
        System.out.println(postfix);
    }
    static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        String result ="";
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if(Character.isLetter(ch))
                result += ch;
            else if(ch=='(')
                stack.push(ch);
            else if(ch==')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                stack.pop();
            } else {
                    while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())) {
                        result +=stack.pop();
                    }
                    stack.push(ch);
                }

            }
        while (!stack.isEmpty())
            result += stack.pop();
        return result;
    }

    static int precedence(char ch){

        if(ch=='^')
            return 3;
        else if(ch=='*' || ch=='/')
            return 2;
        else if(ch=='+' || ch=='-')
            return 1;
        return 0;

    }
}
