import java.util.Arrays;
import java.util.NoSuchElementException;

public class HashSet {

    private int data[] = new int[10];

    int size=0;

    public void add(int num) {
        if(size==data.length)
            throw new IllegalStateException();
        int index = hash(num);
        data[index] = num;
        size++;
    }

    private int hash(int num) {

        int i=0;
        int newLocation=(2*num+3)%10;
        while (data[newLocation]!=0 && i<data.length-1) {
            newLocation = (newLocation+i)%10;
            i++;
        }
        return newLocation;

    }

    public void remove(int key) {
        int index = hash(key);
        if(data[index]==0)
            throw new NoSuchElementException();
        data[index]=0;
        size--;
    }
    
    public boolean containsKey(int num) {
        int index = hash(num);
        return data[index] != 0;
    }

    public boolean isEmpty() {
        for (int i = 0; i < data.length; i++) {
            if(data[i]!=0)
                return false;
        }
        return true;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

}

