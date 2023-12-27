package Revision;

import java.util.Scanner;

public class SearchElementRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(searchElement(arr,n,target));
        System.out.println(searchElement1(arr,n,target));
    }

    private static int searchElement1(int[] arr, int n, int target) {
        int low = 0;
        int high = n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[low]<=arr[mid]) {
                if(arr[low]<=target && target <= arr[mid]) {
                    high=mid-1;
                } else {
                    low = mid+1;
                }
            } else {
                if(arr[mid]<=target && target <= arr[high]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    private static int searchElement(int[] arr, int n,int target) {
        for (int i = 0; i < n; i++) {
           if(arr[i]==target)
               return i;
        }
        return -1;
    }


}

