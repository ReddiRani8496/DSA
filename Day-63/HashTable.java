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
        
        var entry = getEntry(key);
        if(entry != null) {
            entry.value = value;
            return;
        }
        getOrCreateBucket(key).addLast(new Entry(key,value));
    }
    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if(bucket==null)
            entries[index] = new LinkedList<>();
        return bucket;
    }
    private Entry getEntry(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if(bucket != null) {
            for(var entry : bucket) {
                if(entry.key == key)
                    return entry;
            }
        }
        return null;
    }

    private boolean isEmpty(int index) {
        return entries[index] == null;
    }

    private  int hash(int key) {
        return key%entries.length;
    }

    public String get(int key) {
       var entry = getEntry(key);
       return (entry==null) ? null : entry.value;
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if(entry==null)
            throw new NoSuchElementException();
        getBucket(key).remove(entry);
    }
    
    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
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

