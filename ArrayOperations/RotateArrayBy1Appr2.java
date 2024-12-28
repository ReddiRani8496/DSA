import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayBy1Appr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       rotate(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int n) {
        int temp = arr[n-1];
        for(int i=n-2;i>=0;i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
}
