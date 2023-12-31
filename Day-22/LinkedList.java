import java.util.HashSet;
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

    public void getKLast(int k) {
        if(isEmpty())
            throw new IllegalStateException();

        var first = head;
        var second = head;
        for(int i=0;i<k-1;i++) {
            second = second.next;
            if(second == null)
                throw new IllegalArgumentException();
        }
        while (second!=tail) {
            first = first.next;
            second = second.next;
        }
        System.out.println(first.value);
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

    static LinkedList createLoop() {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        var backUp = list.tail;
        list.addLast(50);
        list.addLast(60);
     //  list.tail.next = backUp;
        return list;
    }

    public boolean detectLoop() {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

    // public boolean detectLoop() {
    //     HashSet<Object> set = new HashSet<>();
    //     var node = head;
    //     while ( node.next != null && (!set.contains(node))){
    //         set.add(node);
    //         node = node.next;

    //     }
    //     return node.next != null;
    // }

}