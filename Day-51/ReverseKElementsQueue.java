import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementsQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        reverseKElements(queue,3);
        System.out.println(queue);
    }
    public static void reverseKElements(Queue<Integer> queue, int k) {
        if(k<0 || k>queue.size())
            throw new IllegalStateException();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty())
            queue.add(stack.pop());
        for (int i = 0; i < queue.size()-k; i++) {
            queue.add(queue.remove());
        }
    }
}
