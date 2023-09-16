import java.util.EmptyStackException;
import java.util.Stack;

public class MaxStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> maxStack = new Stack<>();

    public void push(int item) {
        stack.push(item);
        if(maxStack.isEmpty())
            maxStack.push(item);
        else if(item> maxStack.peek())
            maxStack.push(item);
    }
    public int pop(int item) {
        if(stack.isEmpty())
            throw new EmptyStackException();
        var top = stack.pop();
        if(top == maxStack.peek())
            maxStack.pop();
        return top;
    }
    public int max() {
        if(maxStack.isEmpty())
            throw new EmptyStackException();
        return maxStack.peek();
    }
}
