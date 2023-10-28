import java.util.Arrays;
public class CommonElementsBS {
    public static void main(String[] args) {
        int[] arr = {1,54,23,98};
        int[] arr1 = {7,45,11,98};
        Arrays.sort(arr1);
        System.out.println(commonElement(arr,arr1));
    }
    public static boolean commonElement(int[] arr,int[] arr1) {
        for (int j : arr) {
            int low = 0, end = arr1.length - 1;
            while (low <= end) {
                int mid = (low + end) / 2;
                if (arr1[mid] == j) {
                    return true;
                } else if (arr1[mid] > j)
                    end = mid - 1;
                else if (arr1[mid] < j)
                    low = mid + 1;
            }
        }
        return false;
    }
}
