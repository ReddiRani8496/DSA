import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4};
        int element = 9;
        int index = 3;
        int[] newArray = new int[arr.length+1];
        for(int i=0;i<index;i++) {
            newArray[i] = arr[i];
        }
        newArray[index] = element;
        for(int i=index+1;i<newArray.length;i++) {
            newArray[i] = arr[i-1];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
