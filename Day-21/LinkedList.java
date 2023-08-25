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

    public void printMiddle() {

        if(isEmpty())
            throw new NoSuchElementException();

        if(head == tail)
            System.out.println(head.value);

        else {
            var current = head;
            int start = 0;
            while (current!=null){
                if(start==size/2) {
                    System.out.println(current.value);
                    break;
                }
                start++;
                current = current.next;
            }
        }
    }

    public void getKElement(int k) {

        if(isEmpty())
            throw new NoSuchElementException();

        if(k <= 0 || k>size)
            throw new IllegalArgumentException();

        int start = 0;
        int index = size-k;
        var current = head;

        while (current != null){
            if(start==index) {
                System.out.println(current.value);
                break;
            }
            start++;
            current = current.next;
        }
    }

    public void getPreviousNode(int value) {

        if(indexOf(value)==-1)
            throw new NoSuchElementException();
        
        if(head==tail)
            return;

        Node  current = head.next;
        Node next = current.next;

        if(head.value==value) {
            if (isContainsValue(value)) {
                current = head.next;
                next = current.next;
            }
            else {
                System.out.println("No previous element");
                return;
            }
        }

        while (current!=null){
            if(next.value==value){
                    System.out.println(current.value);
                    return;

            }
            current = next;
            next = next.next;
        }
        System.out.println(head.value);
    }
    private boolean isContainsValue(int value){
        var current = head.next;
        int start = 0;
        while (current != null) {
            if(current.value == value)
                return true;
            current = current.next;
            start ++;
        }
        return  false;
    }

    public void getNextNextNode(int value) {
        if(indexOf(value)==-1)
            throw new NoSuchElementException();

        if(head==tail)
            return;
        
            var current = head;

        while (current.next!=tail) {
            if(current.value==value) {
                System.out.println(current.next.next.value);
                return;
            }
            current= current.next;
        }

        System.out.println("No next next node");
    }

}