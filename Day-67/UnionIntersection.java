import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr1[] = {3,4,7,6};
       // intersection(arr,arr1);
        union(arr,arr1);
    }
    public static void intersection(int[] arr, int[] arr1) {
        HashSet<Integer> set = new HashSet<>();
        for (int k : arr) {
            set.add(k);
        }
        for (int j : arr1) {
            if (set.contains(j))
                System.out.println(j);
            else
                set.add(j);
        }
    }
    public static void union(int[] arr, int[] arr1) {
        HashSet<Integer> set = new HashSet<>();
        for(var x : arr)
            set.add(x);
        for(var x : arr1)
            if(!set.contains(x))
                set.add(x);
        for (var x : set)
            System.out.println(x);
    }
}

