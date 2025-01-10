import java.util.Arrays;
import java.util.Scanner;

public class ReverArrayUsingExtraArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        } 
        
        int res[] = reverse(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] reverse(int[] arr) {

        int res[] = new int[arr.length];
        for(int i= arr.length - 1; i>=0; i--)
            res[i] = arr[i];

        return res;
    }
}
