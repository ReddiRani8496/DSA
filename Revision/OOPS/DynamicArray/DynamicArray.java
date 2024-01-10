package DynamicArray;

public class DynamicArray {
    private int[] arr;
    private static int index;
    DynamicArray() {
        arr = new int[5];
        index = 0;
    }
    public int size() {
        return index;
    }
    public boolean isEmpty() {
        return index==0; // true or false
    }

    public void add(int element) {
        if(index==arr.length) {
            int temp[] = new int[arr.length*2];
            System.arraycopy(arr,0,temp,0,arr.length);
            arr = temp;
        }
        arr[index++] = element;
    }

    public int get(int i) {
        if(i>=index || i<0)
            return -1;
        return arr[i];
    }

    public void set(int i,int element) {
        if(i>=index || i<0)
            throw new ArrayIndexOutOfBoundsException();
        arr[i] = element;
    }

    public int removeLast() {
        if(index==0)
            return -1;
        int temp = arr[index-1];
        index--;
        return temp;
    }
    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
