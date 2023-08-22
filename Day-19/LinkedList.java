public class LinkedList {
    private class Node {
        int value;
        Node next;
        Node(int value){
            this.value =value;
        }
    }
    private Node head;
    private Node tail;
    void addLast(int item) {
        var node = new Node(item);
        node.value = item;
        if(head==null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }

    void addFirst(int item) {
        var node = new Node(item);
        if(head==null)
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
    }

    int valueOf(int index) {
        var current = head;
        int start = 0;
        while (current != null) {
            if(start == index)
                return current.value;
            current = current.next;
            start++;
        }
        return -1;
    }

    int indexOf(int value) {
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

    boolean contains(int value) {
        return indexOf(value) != -1;
    }

}
