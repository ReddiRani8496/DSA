import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashTable {
    private class Entry {
        int key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<Entry>[] entries = new LinkedList[10];

    public void put(int key, String value) {
        int index = hash(key);
        if(isEmpty(index))
            entries[index] = new LinkedList<>();
        var bucket = entries[index];
        for(var entry : bucket) {
            if(entry.key==key) {
                entry.value = value;
                return;
            }
        }
        var entry = new Entry(key,value);
        entries[index].addLast(entry);
    }

    private boolean isEmpty(int index) {
        return entries[index] == null;
    }

    private  int hash(int key) {
        return key%entries.length;
    }

    public String get(int key) {
        int index = hash(key);
        var bucket = entries[index];
        if(bucket!=null) {
            for(var entry : bucket) {
                if(entry.key == key)
                    return entry.value;
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        var bucket = entries[index];
        if(bucket!=null) {
            for (var entry : bucket) {
                if(entry.key == key) {
                    bucket.remove(entry);
                    return;
                }
            }
        }
        throw new NoSuchElementException();
    }
    public boolean containsKey(int key) {
        int index = hash(key);
        var bucket = entries[index];
        if(bucket!=null) {
            for (var entry : bucket) {
                if(entry.key == key)
                    return true;

            }
        }
        return false;
    }
    
    public boolean containsValue(String value) {
        for(var bucket : entries) {
            if(bucket==null) {
                continue;
            } 
            for(var entry : bucket) {
                if(entry.value.equals(value))
                    return true;
            }
        }
        return false;
    }
    
}

