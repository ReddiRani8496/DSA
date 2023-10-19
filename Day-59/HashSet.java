import java.util.Arrays;

public class HashSet {
    private int data[] = new int[10];
    public void add(int num) {
        int index = hash(num);
        data[index] = num;
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
    public boolean containsKey(int num) {
        int index = hash(num);
        return data[index] != 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}

