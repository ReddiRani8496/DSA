import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the required sum: ");
        int sum = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++)
            map.put(arr[i], i);
        for(Map.Entry<Integer,Integer> val : map.entrySet()) {
            int diff = sum-val.getKey();
            if(map.containsKey(diff)){
                System.out.println(val.getValue()+" "+map.get(diff));
                break;
            }
        }

    }
}
