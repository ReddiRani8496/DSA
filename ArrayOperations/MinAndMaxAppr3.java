import java.util.Scanner;

public class MinAndMaxAppr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findMinMax(arr,n);
    }
    public static void findMinMax(int[] arr, int n) {
        if(n==0)
            return;
        if(n==1){
            System.out.println("Min: " + arr[0] + " Max: " + arr[1]);
            return;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(arr[0]>arr[1]) {
            max = arr[0];
            min = arr[1];
        } else {
            max = arr[1];
            min = arr[0];
        }
        for(int i=2;i<n;i++) {
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("Min: " + min + " Max: " + max);
    }
}
