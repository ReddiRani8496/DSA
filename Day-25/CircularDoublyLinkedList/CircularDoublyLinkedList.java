public class CircularDoublyLinkedList {
    
    private class Node {
        private Node previous;
        private Node next;
        private int data;
        Node(int value) {
            this.data = value;
        }
    }

    private Node head;

    public void addLast(int value) {
        var node = new Node(value);
        if (head == null) {
            head = node;
            head.next = node;
        } else {
            var current = head.next;
            while (current.next != head) {
                current = current.next;
            }
            node.previous = current;
            current.next = node;
            node.next = head;
        }
    }

    public void addFirst(int value) {
        var node = new Node(value);
        if(head == null) {
            head = node;
            head.next = node;
        } else {
            var current = head;

            while(current.next != head)
                current = current.next;

            current.next = node;
            node.next = head;
            head.previous = node;
            head = node;
        }
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
}
