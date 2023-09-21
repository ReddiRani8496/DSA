import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
    Node head;
    private Node tail;

    private int size;
    public void addLast(int item) {
        var node = new Node(item);
        if(head==null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    static LinkedList createLoop() {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        var backUp = list.tail;
        list.addLast(30);
//        list.addLast(40);

        list.addLast(50);
        list.addLast(60);
        list.tail.next = backUp;
        return list;
    }

    boolean detectLoop() {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

    public int lengthOfLoop() {
        var current = head;
        HashMap<Object,Integer> map = new HashMap<>();
        int count = 1;
        while (current.next!=null) {
            if(!map.containsKey(current)) {
                map.put(current,count++);
                current = current.next;
            } else {
                int start = map.get(current);
                return count-start;
            }
        }
        return 0;
    }
    public int lenOfLoop() {
        var slow = head;
        var fast = head;
        int count = 0;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast) {
                while (slow.next!=fast) {
                    count++;
                    slow = slow.next;
                }

                return count+1;
            }
        }
        return 0;
    }
    public void removeLoop() {
        var current = head;
        HashSet<Object> set = new HashSet<Object>();
        set.add(current);
        while (!set.contains(current.next)) {
            if(!set.contains(current.next))
                set.add(current.next);
            else
                break;
            current = current.next;
        }
        current.next = null;
    }
}

