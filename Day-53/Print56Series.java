import java.util.ArrayDeque;
import java.util.Queue;

public class Print56Series {
    public static void main(String[] args) {
        print56Series(6);
        print345Series(30);
    }
    public static void print56Series(int n) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("5");
        queue.add("6");
        for (int i = 0; i < n; i++) {
            String front = queue.remove();
            System.out.print(front+" ");
            queue.add(front+"5");
            queue.add(front+"6");
        }
        System.out.println();
    }
    
    public static void print345Series(int n) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("3");
        queue.add("4");
        queue.add("5");
        for (int i = 0; i < n; i++) {
            String front = queue.remove();
            System.out.print(front+" ");
            queue.add(front+"3");
            queue.add(front+"4");
            queue.add(front+"5");
        }
        System.out.println();
    }
}
