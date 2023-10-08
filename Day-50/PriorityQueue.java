import java.util.Arrays;

public class PriorityQueue {
    private int items[] = new int[8];
    private int size;
    public void enqueue(int item) {
        if(isFull())
            throw new IllegalStateException();
        int i = shitItemsToInsert(item);
        items[i] = item;
        size++;
    }

    private int shitItemsToInsert(int item) {
        int i;
        for (i = size-1; i >= 0; i--) {
            if(items[i] > item)
                items[i+1] = items[i];
            else
                break;
        }
        return i+1;
    }
    private boolean isFull() {
        return  size == items.length;
    }

    public int dequeue() {
        if(isEmpty())
            throw new IllegalStateException();
        var front = items[--size];
        items[size] = 0;
        return front;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items,0,size));
    }
}

