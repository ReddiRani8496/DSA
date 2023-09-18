import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackLL {
    LinkedList<Integer> list = new LinkedList<>();
    public void push(int item) {
        list.addFirst(item);
    }

    public int pop() {
        if(isEmpty())
            throw new EmptyStackException();
        var temp = list.getFirst();
        list.removeFirst();
        return temp;
    }
    public int peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return list.getFirst();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
