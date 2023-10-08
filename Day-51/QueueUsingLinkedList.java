import java.util.ArrayList;

public class QueueUsingLinkedList {
    private class  Node {
        private int data;
        private Node next;
        Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void enqueue(int item) {
        Node node = new Node(item);
        if(isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public int dequeue() {
        if(isEmpty())
            throw new IllegalStateException();
        int front = head.data;
        if(head == tail)
            head = tail = null;
        else {
            var second = head.next;
            head.next = null;
            head = second;
        }
        size--;
        return front;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        if(isEmpty())
            throw new IllegalStateException();
        return head.data;
    }

    public int size() {
        return  size;
    }

    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();
        var current = head;
        while (current!=null) {
            list.add(current.data);
            current = current.next;
        }
        return list.toString();
    }
}
