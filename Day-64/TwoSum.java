import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int res[];
        res = twoSum(arr,target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] twoSum(int[] arr,int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int index[] = new int[2];
        for(int i=0;i<arr.length;i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)) {
                index[0] = map.get(diff);
                index[1] = i;
                return index;
            }
            map.put(arr[i],i);
        }
        index[0]=-1;
        index[1]=-1;
        return index;
    }
}

