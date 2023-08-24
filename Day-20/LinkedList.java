import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
    private Node head;
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
    private boolean isEmpty(){
        return head==null;
    }

    public int valueOf(int index) {
        var current = head;
        int start = 0;
        while (current != null) {
            if(start == index)
                return current.value;
            current = current.next;
            start++;
        }
        return  -1;
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

    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException();
        if(head == tail)
            head = tail = null;
        else {
            Node temp = head.next;
            head.next = null;
            head = temp;
        }
        size--;
    }

    public void removeLast() {
        if(isEmpty())
            throw new NoSuchElementException();
        if(head == tail)
            head = tail = null;
        else {
            Node current = head;

            while (current.next != tail)
                current = current.next;

            current.next = null;
            tail = current;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        if(isEmpty())
            return;
        var previous = head;
        var current = head.next;

        while (current!=null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }
}
