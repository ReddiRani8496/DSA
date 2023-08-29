import java.util.NoSuchElementException;

public class CircularLinkedList {
    private class Node {
        private int data;
        private Node next;
        Node(int value) {
            this.data = value;
        }
    }
    private Node head;
    private int size;
    public void addLast(int value) {
        var node = new Node(value);
        if(isEmpty()) {
            head = node;
            head.next = head;

        } else {
            var current = head.next;
            while (current.next != head) {
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }
        size++;
    }

    public void addLastOptimized(int value) {
        var node = new Node(value);

        if(isEmpty()) {
            head = node;
            head.next = head;
        } else {
            int temp = head.data;
            head.data = node.data;
            node.data = temp;
            node.next = head.next;
            head.next = node;
            head = node;
        }
    }
    public void addFirst(int value) {

        var node = new Node(value);

        if(isEmpty()) {
            head = node;
            head.next = head;
        } else {
            var current = head;
            while (current.next != head)
                current = current.next;
            current.next = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addFirstOptimized(int value) {
        var node = new Node(value);

        if(isEmpty()) {
            head = node;
            head.next = head;
        } else {
            int temp = head.data;
            head.data = node.data;
            node.data = temp;
            var backup = head.next;
            head.next = node;
            node.next = backup;
        }
        size++;
    }

    public void addAt(int index, int value) {

        if(index < 0 || index > size)
            throw new IllegalArgumentException();

        if(index == 0) {
            addFirst(value);
            return;
        }
        if(index==size) {
            addLast(value);
        } else {
            var node = new Node(value);
            int start = 0;
            var current = head;
            while (start<index-1) {
                current = current.next;
                start++;
            }
            var temp = current.next;
            current.next = node;
            node.next = temp;
            size++;
        }
    }

    boolean isEmpty(){
        return head==null;
    }

    public void print() {

       if(head != null) {
           System.out.print(head.data+" ");
           var current = head.next;
           while (current != head) {
               System.out.print(current.data+" ");
               current = current.next;
           }
       }
        System.out.println();

    }

    public void removeFirst() {

        if(isEmpty())
            throw new NoSuchElementException();

        if(head.next == head)
            head = null;

        else {
            var current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            var temp = head.next;
            head.next = null;
            head = temp;
        }
        size--;
    }

    public void removeLast() {

        if(isEmpty())
            throw new NoSuchElementException();

        if(head.next == head)
            head = null;

        else {
            var current = head;
            while (current.next.next != head)
                current = current.next;
            current.next = head;
        }
        size--;

    }

    public void removeAt(int index) {

        if(index < 0 || index >= size)
            throw new IllegalArgumentException();

        if(index == 0) {
            removeFirst();
            return;
        }
        if(index == size()-1) {
            removeLast();
            return;
        }
        var current = head;
        int start = 0;
        while (start < index-1) {
            current = current.next;
            start++;
        }
        var temp = current.next.next;
        current.next.next = null;
        current.next = temp;
        size--;
    }

    public int size() {
        return size;
    }

    public int indexOf(int value) {

        if(isEmpty())
            throw new IllegalStateException();

        if(head.data == value)
            return 0;

        int index = 1;
        var current = head.next;
        while (current != head) {
            if(current.data == value)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int lastIndexOf(int value) {
        if (isEmpty())
            throw new IllegalStateException();

        if(indexOf(value)==-1)
            return -1;

        else {
            var current = head;
            int start = 0;
            int index=0;
            while (current.next != head) {
                if (current.data == value)
                    index = start;
                start++;
                current = current.next;
            }
            if(current.data == value)
                index = start;
            return index;
        }
    }

}

