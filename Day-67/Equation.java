import java.util.HashMap;
import java.util.HashSet;

public class Equation {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        pairsNaiveApproach(arr);
        pairsUsingHashing(arr);
    }
    public static void pairsNaiveApproach(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int sum = arr[i];
            for(int k=i+1;k<arr.length;k++) {
                sum += arr[k];
                for (int j = i + 2; j < arr.length - 1; j++) {
                    if (arr[j] + arr[j + 1] == sum)
                        System.out.println(arr[i] + " " + arr[i + 1] + " " +arr[j] + " " + arr[j + 1]);
                }
            }
        }
    }

    public static void pairsUsingHashing(int[] arr) {
        HashMap<Integer,int[]> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i]+arr[j];
                if(map.containsKey(sum)) {
                    int elements[] = map.get(sum);
                    System.out.print("(" + arr[i] +","+arr[j]+")\t");
                    System.out.println("(" + elements[0] +","+elements[1]+")");
                } else {
                    map.put(sum,new int[] {arr[i],arr[j]});
                }
            }
        }
    }
}
