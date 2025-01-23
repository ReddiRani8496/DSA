// [3, 6, 2, 1, 8, 7, 4, 5, 3, 1] sort using bubble sort, selection sort, insertion sort, counting sort

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {

        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        countingSort(arr);

        int arr1[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(arr1);

        int[] arr2 = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        insertionSort(arr2);
        
        int[] arr3 = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        selectionSort(arr3);
    }
    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }

        int[] count = new int[largest+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0;i<count.length;i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {

        for(int i=0;i<arr.length-1;i++) {

            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }

    public static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    public static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length-1;i++) {
            int minIndex = i;

            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

