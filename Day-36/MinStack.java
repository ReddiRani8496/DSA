import java.util.EmptyStackException;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int item) {
        stack.push(item);
        if(minStack.isEmpty())
            minStack.push(item);
        else if(item<minStack.peek())
            minStack.push(item);
    }
    public int pop(int item) {
        if(stack.isEmpty())
            throw new EmptyStackException();
        var top = stack.pop();
        if(top == minStack.peek())
            minStack.pop();
        return top;
    }
    public int min() {
        if(minStack.isEmpty())
            throw new EmptyStackException();
        return minStack.peek();
    }
}
