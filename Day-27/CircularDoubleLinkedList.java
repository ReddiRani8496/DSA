import java.util.NoSuchElementException;

public class CircularDoubleLinkedList {
    private class Node {
        private Node previous;
        private Node next;
        private int data;
        Node(int value) {
            this.data = value;
        }
    }
    private Node head;

    private int size;
    public void addLast(int value) {
        var node = new Node(value);
        if (head == null) {
            head = node;
            head.next = head.previous = node;
        } else {
            var current = head.next;
            while (current.next != head) {
                current = current.next;
            }
            node.previous = current;
            current.next = node;
            node.next = head;
            head.previous = node;
        }
        size++;
    }

    public void addLastOptimized(int value)  {
        var node = new Node(value);
        if (head == null) {
            head = node;
            head.next = head.previous = node;
        } else {
            int temp = head.data;
            head.data = node.data;
            node.data = temp;
            node.next = head.next;
            node.previous = head;
            head.next = node;
            head = node;
        }
        size++;
    }
    public void addFirst(int value) {
        var node = new Node(value);
        if(head == null) {
            head = node;
            head.next = head.previous = node;
        } else {
            var current = head;

            while(current.next != head)
                current = current.next;

            current.next = node;
            node.next = head;
            head.previous = node;
            node.previous = current;
            head = node;
        }
        size++;
    }

    public void addFirstOptimized(int value) {
        var node = new Node(value);
        if(head == null) {
            head = node;
            head.next = head.previous = node;
        } else {
            int temp = head.data;
            head.data = node.data;
            node.data = temp;
            var backup = head.next;
            head.next = node;
            node.previous = head;
            node.next = backup;
        }
        size++;
    }

    public void addAt(int index, int value) {

        if(index < 0 || index > size)
            throw new IllegalArgumentException();

        if(index == 0) {
            addFirstOptimized(value);
            return;
        }
        if(index==size) {
            addLastOptimized(value);
        } else {
            var node = new Node(value);
            int start = 0;
            var current = head;
            while (start<index-1) {
                current = current.next;
                start++;
            }
            var temp = current.next;
            current.next = node;
            node.previous = current;
            node.next = temp;
            size++;
        }
    }

    public void addInRightSlot(int x) {
        Node node = new Node(x);
        if(head == null) {
            head = node;
            head.next = head.previous= node;
            size++;
        } else if(node.data < head.data) {
            addFirstOptimized(x);
        } else if(node.data> head.data){
            var current = head;
            int index = 1;

            while (current.next != head) {
                if(current.data < node.data && current.next.data > node.data) {
                    addAt(index,node.data);
                    return;
                }
                current = current.next;
                index++;
            }

            if(node.data > current.data)
                addLastOptimized(node.data);
        }
    }
    public void removeFirst() {
        
    }

    public void removeDuplicates() {
        if(head == null)
            throw new NoSuchElementException();

        if(head.next == head) {
            return;
        }
        else {
            var current = head;
            while(current.next != head) {
                if(current.data == current.next.data) {
                    var temp = current.next.next;
                    current.next.previous = null;
                    current.next = temp;
                    temp = null;
                    size--;
                } else
                    current = current.next;
            }
        }
    }

    public int size() {
        return size;
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

