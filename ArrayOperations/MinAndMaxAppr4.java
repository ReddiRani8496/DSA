import java.util.Scanner;

public class MinAndMaxAppr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       Pair p = findMinMax(arr, 0,n-1);
        System.out.println("Min: " + p.min);
        System.out.println("Max: " + p.max);
    }
    public static Pair findMinMax(int[] arr,int start,int end) {
        Pair minMax = new Pair();
        Pair leftMinMax = new Pair();
        Pair rightMinMax = new Pair();

        if(start==end) {
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }
        if(end==start+1) {
            if(arr[start]>arr[end]) {
                minMax.max = arr[start];
                minMax.min = arr[end];
            } else {
                minMax.max = arr[end];
                minMax.min = arr[start];
            }
            return minMax;
        }
        int mid = (start+end)/2;
        leftMinMax = findMinMax(arr, start, mid);
        rightMinMax = findMinMax(arr, mid+1, end);
        minMax.max = Math.min(leftMinMax.max, rightMinMax.max);
        minMax.min = Math.min(leftMinMax.min, rightMinMax.min);
        return minMax;
    }

}
class Pair {
    int max;
    int min;
}
