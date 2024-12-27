import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr, int start, int end) {
        if(start>=end) return;
        int temp = arr[start];
         arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }
}
