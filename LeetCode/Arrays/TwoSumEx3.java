// two sum problem using hash set

import java.util.HashSet;

public class TwoSumEx3 {

    public static void main(String[] args) {

        int arr[]={7,4,9,5,3};
        int target=7;

        HashSet<Integer> set = new HashSet<>();

        for(var x: arr)
            set.add(x);

        for (Integer x : set) {
            int diff = target - x;
            if(set.contains(diff)) {
                System.out.println("Target found");
                return;
            }
        }

        System.out.println("Target not found");
    }
}
