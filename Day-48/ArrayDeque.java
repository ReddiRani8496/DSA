import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayDeque {
    int items[];
    ArrayDeque(int size) {
        items = new int[size];
    }
    int front;
    int rear;
    int count;

    public void enqueue(int item) {
        if(isFull())
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear+1)%items.length;
        count++;
    }

    public int dequeue() {
        if(isEmpty())
            throw new NoSuchElementException();
        int frontItem = items[front];
        items[front] = 0;
        front = (front+1) % items.length;
        count --;
        return frontItem;
    }

    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return  count == items.length;
    }

    public int peek() {
        if(isEmpty())
            throw new NoSuchElementException();
        return items[front];
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}

