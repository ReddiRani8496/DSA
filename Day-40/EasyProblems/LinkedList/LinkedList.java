import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
    Node head;
    private Node tail;
    private int size;
    public void addLast(int item) {
        var node = new Node(item);
        if(isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return head==null;
    }

    public void printMiddle() {
        if(isEmpty())
            throw new IllegalArgumentException();
        var first = head;
        var second = head;

        while (second != tail && second.next != tail) {
            first = first.next;
            second = second.next.next;
        }
        if(second == tail)
            System.out.println(first.value);
        else
            System.out.println(first.value+" "+first.next.value);
    }

    public int indexOf(int value) {
        var current = head;
        int start = 0;
        while (current != null) {
            if(current.value == value)
                return start;
            current = current.next;
            start ++;
        }
        return  -1;
    }

    boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int occurance(int item) {
        if(!contains(item))
            throw new NoSuchElementException();
        var current = head;
        int count = 0;
        while (current!=null) {
            if(current.value == item)
                count++;
            current = current.next;
        }
        return count;
    }
    public boolean isCircularLL() {
        if(head==null)
            throw new IllegalStateException();
        var current = head;
        while (current.next!=head) {
            if(current.next==null)
                return false;
            current = current.next;
        }
        return true;
    }
    public void reverse(Node head) {
        if(head == null)
            return;
        reverse(head.next);
        System.out.println(head.value);
    }
    public Node convertingToCircularLL() {
        var current = head;
        while (current.next!=null) {
            current = current.next;
        }
        current.next = head;
        return head;
    }
}
