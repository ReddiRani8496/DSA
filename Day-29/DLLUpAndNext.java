public class DLLUpAndNext {
    Node head;
     class Node {
        int value;
        Node up;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }


    void addNext(int value) {
        var node = new Node(value);
        if(head==null) {
            head=node;
            head.value = value;
        } else {
            var current = head;
            while(current.next !=null)
                current = current.next;
            current.next = node;
        }
    }
    void addUp(int value) {
        var node = new Node(value);
        if(head == null) {
            head = node;
            head.value = value;
        } else {
            var current = head;
            while(current.up !=null)
                current = current.up;
            current.up = node;
        }
    }
}
