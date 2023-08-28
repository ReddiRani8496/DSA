public class DoublyLinkedList {
    private class Node {
        private int value;
        private Node previous;
        private Node next;
        Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int size = 0;

    public void addLast(int value) {
        var node = new Node(value);
        if(isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    public void addFirst(int value) {
        var node = new Node(value);
        if(isEmpty())
            head = tail = node;
        else {
            head.previous = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addManyLast(int[] items) {
        for(var x : items){
            addLast(x);
            size++;
        }
    }

    public void addManyFirst(int[] items) {
        for(var x : items) {
            addFirst(x);
            size++;
        }
    }

    public void addAt(int index, int value) {
        if(index < 0 || index>size)
            throw new IllegalArgumentException();
        if(index == 0){
            addFirst(value);
            return;
        }
        if(index == size()) {
            addLast(value);
            return;
        }
        var node = new Node(value);
        var current = head;
        int start =0;
        while (start<index-1) {
            current = current.next;
            start++;
        }
        current.next.previous = node;
        node.next = current.next;
        current.next = node;
        node.previous = current;

    }

    private boolean isEmpty() {
        return head == null;
    }

    public void printElements() {

        var current = head;
        while (current != null) {
            System.out.print(current.value+" ");
            current = current.next;
        }
        System.out.println();
    }

    public void printReverse() {
        var current = tail;
        while (current != null) {
            System.out.print(current.value+" ");
            current = current.previous;
        }
        System.out.println();
    }
    int size() {
        return size;
    }
    public void removeFirst() {
        if(isEmpty())
            throw new IllegalStateException();
        if(head == tail)
            head = tail = null;
        else {
            var temp = head.next;
            head.next = null;
            head = temp;
            head.previous = null;
        }
        size--;
    }

    public void removeLast() {
        if(isEmpty())
            throw new IllegalStateException();
        if(head == tail)
            head = tail = null;
        else {
            var temp = tail.previous;
            temp.next.previous=null;
            temp.next = null;
            tail = temp;
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
        current.next.next.previous = current;
        current.next.previous = null;
        current.next.next = null;
        current.next = temp;
        size--;
    }

    public int indexOf(int value) {
        var current = head;
        int start = 0;
        while (current != null) {
            if(current.value == value)
                return start;
            current = current.next;
            start++;
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        if(indexOf(value)==-1)
            return -1;
        else {
            var current = tail;
            int start = size()-1;
            while (current!=null) {
                if(current.value == value)
                    return start;
                current = current.previous;
                start--;
            }
        }
        return -1;
    }

 

    public void reverse() {
        if(isEmpty())
            return;
        var previous = head;
        var current = previous.next;
        while (current!=null) {
            var next = current.next;
            previous.previous = current;
            current.next = previous;
            previous = current;
            current = next;
        }
        tail = head;
        tail.next = null;
        head = previous;
        head.previous = null;
    }
}

