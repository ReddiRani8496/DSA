import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinearProbing {

    private class Entry {

        private int key;
        private String value;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return  key  + ":"+ value ;
        }
    }

    private int count;
    private Entry[] entries = new Entry[10];
    int length = entries.length;

    public void put(int key, String value) {

        if(isFull())
            throw new IllegalStateException();

        var entry = new Entry(key,value);
        int index = hash(key);
        if(entries[index] != null)
            entries[index].value = value;
        else {
            entries[index] = entry;
            count++;
        }
    }

    private int hash(int key) {
        int index = key % length;
        int start = 0;

        while (entries[start]!=null && start < length) {
            if(entries[start].key == key)
                return start;
            start++;
        }

        while (entries[index]!=null)
            index = (index+1)%length;

        return index;
    }

    private boolean isFull() {
        return size() == length;
    }

    private int size() {
        return count;
    }

    public void remove(int key) {
        int index = getIndex(key);

        if(isEmpty(index))
            throw new NoSuchElementException();
            
        entries[index] = null;
        count--;
    }

    private int getIndex(int key) {

        int index = key % length;

        if(entries[index] == null)
            return index;

        if(entries[index].key==key)
            return index;

        int start = 0;

        while (start<length)
            if(entries[start++].key==key)
                return start;

        return start;
    }

    private boolean isEmpty(int index) {
        return entries[index] == null;
    }

    public String get(int key) {
        int index = getIndex(key);

        if(entries[index]==null)
            return null;

        if(entries[index].key==key)
            return entries[index].value;

        int start = index+1;

        while (start<length) {
            if(entries[index]==null)
                return null;
            if (entries[start].key == key)
                return entries[index].value;
            start = (start+1)%length;
        }
        return null;
    }

    public  boolean containsKey(int key) {
        int index = getIndex(key);
        if(entries[index]==null)
            return false;
        if(entries[index].key==key)
            return true;
        int start = index+1;
        while (start<length) {
            if(entries[index]==null)
                return false;
            if (entries[start].key == key)
                return true;
            start = (start+1)%length;
        }
        return false;
    }


    public boolean containsValue(String value) {

        int start = 0;
        while (start<length) {
            if(entries[start]==null) {
                start++;
                continue;
            }
            if (entries[start++].value.equals(value))
                return true;
        }
        return false;
    }

     @Override
    public String toString() {
        return Arrays.toString(entries);
    }
}
