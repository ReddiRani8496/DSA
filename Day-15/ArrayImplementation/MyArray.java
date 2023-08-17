import java.util.Arrays;

public class MyArray {
    private int items[];

    public MyArray(int size){
        items = new int[size];
    }

    private int count = 0;

    void insert(int value) {

        if(items.length == count) {
            int items1[] = new int[count * 2];
            for (int i = 0; i < count; i++) {
                items1[i] = items[i];
            }
            items = items1;
        }

        items[count++] = value;

    }

    void removeAt(int index) {

        if(index < 0 || index >= count)
            throw  new IllegalArgumentException();

        for(int i = index; i < count; i++)
            items[i] = items[i+1];

        count--;

    }

    int indexOf(int value) {

        for (int i = 0; i < count; i++) {
            if(items[i] == value)
                return i;
        }

        return -1;
    }

    int firstIndexOf(int value) {

        for (int i = 0; i < count; i++)
            if(items[i] == value)
                return i;

        return -1;

    }

    int lastIndexOf(int value) {

        for (int i = count-1; i >= 0 ; i--)
            if(items[i] == value)
                return i;

        return -1;

    }

    boolean contains(int value) {

        for (int i = 0; i < count; i++)
            if(items[i] == value)
                return true;

        return false;

    }

    void clear() {
        count = 0;
    }

    boolean isEmpty() {
        return count == 0;
    }

    int x = 0;
    boolean hasNext() {
        return x!=count;
    }
    int next() {
        return items[x++];
    }

    @Override
    public String toString() {
      int[] temp = Arrays.copyOf(items,count);
      return Arrays.toString(temp);
    }

    public void trimToSize() {
        int[] tempArray = new int[count];

        for (int i = 0; i < count; i++)
            tempArray[i] = items[i];

        items = tempArray;
    }

    void subList(int start, int end) {

        if(start < 0 || start >= count)
            throw new IllegalArgumentException();

        else if(!(end >= start && end <= count))
            throw new IllegalArgumentException();

        if(start == end) {
            System.out.println("[]");
            return;
        }

        int temp[] = new int[end-start];

        for (int i = start, j = 0; i < end; i++)
            temp[j++] = items[i];

        System.out.println(Arrays.toString(temp));
    }

    void sort() {
        int[] temp = Arrays.copyOf(items,count);
        Arrays.sort(temp);

        for (int i = 0; i < count; i++)
            items[i] = temp[i];

    }
    int size() {
        return count;
    }
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
