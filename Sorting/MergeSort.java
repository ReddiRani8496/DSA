import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 6, 4};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if(left>=right) {
            return;
        }
        int mid = (left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int arr1[] = new int[mid-left+1];

        int arr2[] = new int[right-mid];
        for(int i=0;i<arr1.length;i++) {
            arr1[i] = arr[left+i];
        }

        for(int i=0;i<arr2.length;i++) {
            arr2[i] = arr[mid + 1 + i];

        }
        int l = 0;
        int r = 0;
        int index = left;

        while (l<arr1.length && r<arr2.length) {
            if (arr1[l] < arr2[r]) {
                arr[index] = arr1[l];
                l++;
            } else {
                arr[index] = arr2[r];
                r++;
            }

            index++;
        }

        while (l<arr1.length) {
            arr[index] = arr1[l];
            l++;
            index++;
        }

        while (r<arr2.length) {
            arr[index] = arr2[r];
            r++;
            index++;
        }
    }
}
