 class Node {
     int data;
     Node next;
    Node(int value) {
        this.data = value;
    }
}
public class CircularLL {

    private Node head;

    public void addLast(int value) {
        var node = new Node(value);
        if(head==null) {
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
    }
    public Node[] splitList(){
        if(head==null)
            throw new IllegalStateException();
        var first = head;
        var second = head;
        Node head2;
        Node[] node = new Node[2];
        if(head.next==head){
            node[0]=first;
            node[1] = second;
            return node;
        }
        while (second.next!=head && second.next.next!=head) {
            second = second.next.next;
            first = first.next;
        }
        var temp = first.next;
        first.next = head;
        head2 = temp;
        second.next = head2;
        node[0]=head;
        node[1] = head2;
        return node;
    }
    public void print(Node node) {

        if(node != null) {
            System.out.print(node.data+" ");
            var current = node.next;
            while (current != node) {
                System.out.print(current.data+" ");
                current = current.next;
            }
        }
        System.out.println();

    }
}
