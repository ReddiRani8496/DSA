import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayBy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int rotatedArray[]=rotate(arr,n);
        System.out.println(Arrays.toString(rotatedArray));
    }
    public static int[] rotate(int[] arr, int n) {
        int temp[] = new int[n];
        temp[0] = arr[n-1];
        for(int i=0;i<n-1;i++) {
            temp[i+1] = arr[i];
        }
        return temp;
    }
}
