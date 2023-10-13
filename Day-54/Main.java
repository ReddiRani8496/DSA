public class Main {
    public static void main(String[] args) {
        DequeueImplementation queue = new DequeueImplementation();
        queue.offerFirst(10);
        queue.offerFirst(20);
        queue.offerFirst(30);
        queue.print();
        queue.offerLast(40);
        queue.offerLast(50);
        queue.print();
        System.out.println(queue.size());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        queue.pollFirst();
        queue.pollLast();
        queue.print();
        queue.pollLast();
        queue.pollLast();
        queue.print();
    }
}