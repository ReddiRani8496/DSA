import java.util.HashSet;
import java.util.Set;

public class TwoPairDiff {
    public static void main(String[] args) {

        int[] arr = {3,4,6,9,2,7,0,5};
        int diff=5;
        int pairs=pairsWithDiff(arr,diff);
        System.out.println(pairs);
    }

    public static int pairsWithDiff(int arr[], int diff) {

        Set<Integer> set = new HashSet<>();

        for(int x : arr)
            set.add(x);

        int count=0;

        for(int x : arr) {

            if(set.contains(x+diff))
                count++;

            if(set.contains(x-diff))
                count++;
                
            set.remove(x);
        }

        return count;
    }
}

