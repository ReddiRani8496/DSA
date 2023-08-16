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

    int size() {
        return count;
    }
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
