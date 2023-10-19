import java.util.Arrays;

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
        while (data[newLocation]!=0) {
            newLocation = (newLocation+i)%10;
            i++;
        }
        return newLocation;

    }


    @Override
    public String toString() {
        return Arrays.toString(data);
    }
    public boolean containsKey(int num) {
        int index = hash(num);
        return data[index] != 0;
    }
}
