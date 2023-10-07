public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.enqueue(10);
        priorityQueue.enqueue(20);
        priorityQueue.enqueue(30);
        System.out.println(priorityQueue);
        int deleted = priorityQueue.dequeue();
        System.out.println(deleted);
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.isEmpty());
    }
}
