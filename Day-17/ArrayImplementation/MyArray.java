import java.util.Arrays;

public class MyArray {
    private int items[];

    public MyArray(int size){
        items = new int[size];
    }

    private int count = 0;

    void insert(int value) {

        if(items.length == count) {
             items = new int[count+1];
        }

        items[count++] = value;

    }
    void insertAt(int index, int value) {

        if(index < 0 || index > count)
            throw  new IllegalArgumentException();

        int temp1[] = new int[count+1];

        for(int i = 0,j=0; i <= count; i++) {
            if (i != index)
                temp1[i] = items[j++];
            else
                temp1[i] = value;
        }


        items = temp1;
        count++;


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
        return indexOf(value);
    }

    int lastIndexOf(int value) {

        for (int i = count-1; i >= 0 ; i--)
            if(items[i] == value)
                return i;

        return -1;

    }

    boolean contains(int value) {
        return indexOf(value) != -1;

    }

    int[] toArray() {
        return Arrays.copyOf(items,count);
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
      return Arrays.toString(Arrays.copyOf(items,count));
    }

    public void trimToSize() {
        int[] tempArray = new int[count];

        for (int i = 0; i < count; i++)
            tempArray[i] = items[i];

        items = tempArray;
    }

    void subList(int start, int end) {

        if(!validIndexes(start,end))
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
    boolean validIndexes(int start, int end) {
        return (start >= 0 && start <= count && end >= start && end <= count);
    }
    void sort() {
        Arrays.sort(Arrays.copyOf(items,count));
    }

    void removeRange(int start, int end) {

        if(!validIndexes(start,end))
            throw new IllegalArgumentException();

        int removeLen = end-start;

        for(int i = end; i < count; i++)
            items[start++] = items[i];

        count -= removeLen;
    }

    void set(int index, int value) {
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        items[index] = value;
    }
    int getIndex(int value) {
        for (int i = 0; i < count; i++)
            if (items[i]==value)
                return i;
        return -1;
    }
    int getValue(int index) {

        if(index < 0 || index>=count)
            throw new IllegalArgumentException();

        return items[index];
    }

    void removeIfGreaterThan(int value) {

        int numbersCount = 0;

        for(int i=0; i<count;i++)
            if(items[i]>value)
                numbersCount++;

        int temp[] = new int[count-numbersCount];
        for (int i = 0, j=0; i < count; i++) {
            if(items[i]<=value)
                temp[j++]=items[i];
        }

        items = temp;
        count -= numbersCount;
    }

    void removeIfLessThan(int value) {
        int numbersCount = 0;

        for(int i=0; i<count;i++)
            if(items[i]<value)
                numbersCount++;

        int temp[] = new int[count-numbersCount];
        for (int i = 0, j=0; i < count; i++) {
            if(items[i]>=value)
                temp[j++]=items[i];
        }

        items = temp;
        count -= numbersCount;
    }

    void removeIfEqualTo(int value) {
        int numbersCount = 0;

        for(int i=0; i<count;i++)
            if(items[i]==value)
                numbersCount++;

        int temp[] = new int[count-numbersCount];
        for (int i = 0, j=0; i < count; i++) {
            if(items[i]!=value)
                temp[j++]=items[i];
        }

        items = temp;
        count -= numbersCount;
    }


    void ensureCapacity(int value) {

        if(value<0)
            throw new IllegalArgumentException();

        int size = items.length;
        while (items.length<value) {
            size *= 2;
            if(size >= value) {
                int items1[] = new int[size];
                for (int i = 0; i < count; i++) {
                    items1[i] = items[i];
                }
                items = items1;
            }

        }

    }

    void printLength() {
        System.out.println(items.length);
    }

    int max() {
       Arrays.sort(items);
        return items[count-1];
    }
    int min() {
      Arrays.sort(items);
      return items[0];
    }

    void reverse() {
        int temp[] = new int[count];
        for (int i = count-1,j=0; i >= 0; i--)
            temp[j++] = items[i];

        items = temp;
    }

    void getItemsOfLength(int length) {

        if(length<1)
            throw new IllegalArgumentException();

        for (int i = 0; i < count; i++) {
            String item = String.valueOf(items[i]);
            if(item.length()==length)
                System.out.println(items[i]);
        }
    }

    void printMiddleItem() {
        int middle = count/2;
        if(count%2==0) {
            System.out.println(items[middle-1]);
            System.out.println(items[middle]);
        }
        else
            System.out.println(items[middle]);

    }

    void intersection(int[] arr) {
       
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < count; j++)
                if(arr[i] == items[j])
                    System.out.println(arr[i]);

    }
    
    int size() {
        return count;
    }
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
