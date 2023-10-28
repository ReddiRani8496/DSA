import java.util.HashSet;
public class CommonElementsHS {
    public static void main(String[] args) {
        int[] arr = {1,54,23,98};
        int[] arr1 = {7,45,11,9};
        System.out.println(commonElements(arr,arr1));
    }
    public static boolean commonElements(int[] arr,int[] arr1) {
        HashSet<Integer> set = new HashSet<>();
        for(var x : arr)
            set.add(x);
        for(var y : arr1) {
            if(set.contains(y))
                return true;
        }
        return false;
    }
}
