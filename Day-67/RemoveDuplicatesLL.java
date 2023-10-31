import java.util.HashMap;

public class RemoveDuplicatesLL {
    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;

    public void addLast(int item) {
        var node = new Node(item);
        if(head==null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void removeDuplicates() {

        if(head == null)
            throw new IllegalStateException();

        var current = head;
        var newCurrent = current;
        while (current!=null){
            while (newCurrent.next!=null) {
                if(current.value == newCurrent.next.value) {
                    var temp = newCurrent.next.next;
                    newCurrent.next.next = null;
                    newCurrent.next = temp;
                }
                else
                    newCurrent = newCurrent.next;
            }
            current = current.next;
            newCurrent = current;
        }
    }

    public void removeDuplicates1() {
        if(head==null)
            throw new IllegalStateException();

        var current = head.next;
        var prev= head;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,head.value);
        int i=1;
        while (current!=null) {
            if(map.containsValue(current.value)) {
                var temp = current.next;
                current.next = null;
                prev.next = temp;
                current = prev.next;
            } else {
                map.put(i++,current.value);
                current = current.next;
                prev = prev.next;
            }
        }
    }
}


