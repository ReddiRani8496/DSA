package Revision;

public class PairInRotatedSortedArray {
    public static void main(String[] args) {
      //  int arr[] = {11, 15, 6, 8, 9, 10};
        //int sum = 16;
        int arr[] = {11, 15, 26, 38, 9, 10};
        int sum = 45;
        int n = arr.length;
        System.out.println(foundPair(arr,sum,n));
        System.out.println(foundPair1(arr,sum,n));
    }

    private static boolean foundPair(int[] arr, int sum, int n) {

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==sum)
                    return true;
            }
        }
        return false;
    }

    private static boolean foundPair1(int[] arr,int sum,int n) {
        int i;

        for (i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1])
                break;
        }

        int l = (i+1)%n;
        int r = i;

        while (l != r) {
            if(arr[l]+arr[r]==sum)
                return true;
            if(arr[l]+arr[r] < sum) {
                l = (l+1)%n;

            }
            else {
                r = (n+r-1)%n;
            }
        }
        
        return false;
    }
}

