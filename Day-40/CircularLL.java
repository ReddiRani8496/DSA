public class CircularLL {
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
            int temp = head.data;
            head.data = node.data;
            node.data = temp;
            node.next = head.next;
            head.next = node;
            head = node;
        }
        size++;
    }
    public void addFirst(int value) {
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
    boolean isEmpty(){
        return head==null;
    }
    public int countNodes() {
        return size;
    }
    public void traversal() {
        if(head==null)
            throw new IllegalStateException();

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
    public void exchangeNodes() {
        if(isEmpty())
            throw new IllegalStateException();
        if(head.next==head)
            return;
        var current = head;
        while (current.next!=head) {
            current = current.next;
        }
        int temp = current.data;
        current.data = head.data;
        head.data = temp;
    }
}
