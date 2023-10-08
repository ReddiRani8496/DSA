import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueues {

    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> queue1 = new LinkedList<>();

    private  int top;

    public void push(int item) {
        queue.add(item);
        top = item;
    }

    public int pop() {
        if(isEmpty())
            throw new IllegalStateException();
        while (queue.size()>1){
            top = queue.remove();
            queue1.add(top);
        }
        var last = queue.remove();
        Queue<Integer> temp = queue;
        queue = queue1;
        queue1 = temp;
        return last;

    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
    
    public int peek() {
        return top;
    }

    @Override
    public String toString() {
        return queue.toString();

    }
}

