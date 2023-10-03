public class Main {
    public static void main(String[] args) {
        ArrayDeque queue = new ArrayDeque(4);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        queue.enqueue(60);
        queue.dequeue();
        queue.enqueue(70);
        System.out.println(queue);
    }
}

