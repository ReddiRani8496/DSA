import java.util.Stack;

public class QueueWithTwoStacks {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        isEmpty();
        pushStack1ToStack2();
        return stack2.pop();
    }
    
    public int peek() {
        isEmpty();
        pushStack1ToStack2();
        return stack2.peek();
    }

    private void pushStack1ToStack2() {
        if(stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    private void isEmpty() {
        if(stack1.isEmpty() && stack2.isEmpty())
            throw new IllegalStateException();
    }

    public int size() {
        return stack1.size()+ stack2.size();
    }

}
