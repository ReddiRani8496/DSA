public class DoubleLinkedList {
    Node head;
     class Node {
        int value;
        Node up;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    static int size = 0;

    void addNext(int value) {
        var node = new Node(value);
        if(head==null) {
            head=node;
        } else {
            var current = head;
            while(current.next !=null)
                current = current.next;
            current.next = node;
        }
        size++;
    }
    void addUp(int value) {
        var node = new Node(value);
        if(head == null) {
            head = node;
        } else {
            var current = head;
            while(current.up !=null)
                current = current.up;
            current.up = node;
        }
        size++;
    }
    public void printNextNodes() {
         var current = head;
         while (current != null) {
             System.out.println(current.value);
             current = current.next;
         }
    }
    public void printUpNodes() {
         var current = head;
         while (current != null){
             System.out.println(current.value);
             current= current.up;
         }
    }

    public void add(int value) {
        if(head == null) {
            addNext(value);
            return;
        }
        var current = head;
        while (current!=null) {
            if(current.value > value) {
                if(current.up == null) {
                    current.up = new Node(value);
                    return;
                }
                current = current.up;
            } else {
                if(current.next == null) {
                    current.next = new Node(value);
                    return;
                }
                current = current.next;
            }
        }
    }
    public boolean search(int value) {
        if(head==null)
            return false;
        if(head.value == value)
            return true;
        var current = head;
        while (current!=null) {
            if(current.value > value) {
                if(current.up != null) {
                    if (current.up.value == value)
                        return true;
                }
                current = current.up;
            } else {
                if(current.next != null) {
                    if (current.next.value == value)
                        return true;
                }
                current = current.next;
            }
        }
        return false;
    }


}
