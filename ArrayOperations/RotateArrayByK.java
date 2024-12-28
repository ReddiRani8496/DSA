import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        rotate(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int n, int k) {
        if(k>n || k<0){
            System.out.println("Invalid Input");
            return;
        }
        for(int i=0;i<=(n-k-1)/2;i++) {
            int temp = arr[i];
            arr[i] = arr[n - k - i - 1];
            arr[n - k - 1 - i] = temp;
        }
        for(int i=0;i<n/2;i++)  {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
}
