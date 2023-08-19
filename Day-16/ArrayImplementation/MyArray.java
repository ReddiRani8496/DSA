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

    void removeRange(int start, int end) {
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
        int max = items[0];
        for (int i = 1; i < count; i++) {
            if(items[i]>max)
                max = items[i];
        }
        return max;
    }
    int min() {
        int min = items[0];
        for (int i = 1; i < count; i++) {
            if(items[i]<min)
                min = items[i];
        }
        return min;
    }

    void reverse() {
        int temp[] = new int[count];
        for (int i = count-1,j=0; i >= 0; i--) {
            temp[j++] = items[i];
        }
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
        else {
            System.out.println(items[middle]);
        }
    }

    void intersection(int[] arr) {
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < count; j++) {
                if(arr[i] == items[j])
                    System.out.println(arr[i]);
            }
        }
       
    }
    
    int size() {
        return count;
    }
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
