import java.util.Scanner;

public class MinAndMaxAppr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findMinMax(arr,n);
    }

    public static void findMinMax(int arr[], int n) {
        if(n==0)
            return;
        int min = arr[0];
        int max = arr[0];
        for(int i = 1;i < n;i++) {
            if(arr[i]<min)
                min = arr[i];
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Min: " + min + " Max: " + max);
    }
}
