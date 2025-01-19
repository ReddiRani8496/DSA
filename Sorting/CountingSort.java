public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 7, 5, 1};
        countingSort(arr);
        System.out.println("Sorted array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void countingSort(int[] arr) {
        // find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(arr[i],largest);
        }

        // count the occurrence of a number in array
        int[] count = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
