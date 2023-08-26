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

    public void addLast(int value) {
        var node = new Node(value);
        if(isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
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
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void printElements() {

        var current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void printReverse() {
        var current = tail;
        while (current != null) {
            System.out.println(current.value);
            current = current.previous;
        }
    }
}
