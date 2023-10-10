import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.addLast(20);
        deque.add(30);
        deque.add(40);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
    }
}
