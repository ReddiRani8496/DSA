public class DequeueImplementation {

    private class Node {
        Node prev;
        Node next;
        int data;
        Node(int data) {
            this.data = data;
        } 
    }

    Node front;
    Node rear;
    int count;
    
    public void offerFirst(int item) {
        Node node = new Node(item);
        if(isEmpty())
            front = rear = node;
        else {
            front.prev = node;
            var second = front;
            front = node;
            front.next = second;
        }
        count++;
    }

    public void offerLast(int item) {
        Node node = new Node(item);
        if(isEmpty())
            front = rear = node;
        else {
            rear.next = node;
            node.prev = rear;
            rear = node;
        }
        count++;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int pollFirst() {
        if(isEmpty())
            throw new IllegalStateException();
        else if(front == rear) {
            int val = front.data;
            front = rear = null;
            count--;
            return val;
        } else {
            int val = front.data;
            var second = front.next;
            front.next = null;
            front = second;
            front.prev = null;
            count--;
            return val;
        }
    }

    public int pollLast() {
        if(isEmpty())
            throw new IllegalStateException();
        else if(front == rear) {
            int val = front.data;
            front = rear = null;
            count--;
            return val;
        } else {
            int val = rear.data;
            var previous = rear.prev;
            rear.prev = null;
            rear = previous;
            rear.next = null;
            count--;
            return val;
        }
    }

    public int peekFirst() {
        if(isEmpty())
            throw new IllegalStateException();
        else
            return front.data;
    }

    public int peekLast() {
        if(isEmpty())
            throw new IllegalStateException();
        else
            return rear.data;
    }

    public void print() {
        var current = front;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public int size() {
        return count;
    }
    
}
