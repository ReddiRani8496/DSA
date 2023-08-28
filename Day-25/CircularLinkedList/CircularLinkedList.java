public class CircularLinkedList {
    private class Node {
        private int data;
        private Node next;
        Node(int value) {
            this.data = value;
        }
    }
    private Node head;

    public void addLast(int value) {
        var node = new Node(value);
        if(head == null) {
            head = node;
            head.next = head;
        }
        else {
            var current = head.next;
            while (current.next != head) {
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }
    }

    public void addFirst(int value) {
        var node = new Node(value);
        if(head == null) {
            head = node;
            head.next = head;
        }
        else {
            var current = head;
            while (current.next != head)
                current = current.next;
            current.next = node;
            node.next = head;
            head = node;
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
}

