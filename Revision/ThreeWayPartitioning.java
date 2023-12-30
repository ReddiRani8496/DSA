package Revision;

import java.util.Arrays;

public class ThreeWayPartitioning {
    public static void main(String[] args) {
        int[] arr = {1,14,5,4,54,87};
        int n = arr.length;
        int low = 10, high=20;
        int start =0,end=n-1;
        for (int i = 0; i <= end; ) {
            if(arr[i]<low) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i]=temp ;
                start++;
                i++;
            } else if(arr[i]>high) {
                int temp =arr[end];
                arr[end]=arr[i];
                arr[i]=temp;
                end--;
            } else  {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void threeWayPartition(int arr[], int low, int high)
    {
        int n = arr.length;
        int start = 0,end = n-1;
        for (int i = 0; i <= end; ) {
            if(arr[i] < low) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp ;
                start++;
                i++;
            } else if(arr[i] > high) {
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            } else  {
                i++;
            }
        }
    }
}
