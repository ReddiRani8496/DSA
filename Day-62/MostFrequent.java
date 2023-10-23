import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if(map.containsKey(arr[i])) {
                int value = map.get(arr[i]);
                map.put(arr[i],value+1);
            } else {
                map.put(arr[i],1);
            }
        }

        int max=Integer.MIN_VALUE;
        int frequent=Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> val : map.entrySet()) {
            if(val.getValue()>max) {
                max = val.getValue();
                frequent = val.getKey();
            }
        }
        
        System.out.println(frequent);
    }
}
