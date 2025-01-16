package Sorting;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = merge(arr1, arr2);
        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int l = 0;
        int r = 0;
        int[] mergedArray = new int[arr1.length + arr2.length];
        int index = 0;
        while (l<arr1.length && r<arr2.length) {
            if (arr1[l] < arr2[r]) {
                mergedArray[index] = arr1[l];
                l++;
            } else {
                mergedArray[index] = arr2[r];
                r++;
            }
            index++;
        }
        while (l<arr1.length) {
            mergedArray[index] = arr1[l];
            l++;
            index++;
        }
        while (r<arr2.length) {
            mergedArray[index] = arr2[r];
            r++;
            index++;
        }
        return mergedArray;
    }
}

