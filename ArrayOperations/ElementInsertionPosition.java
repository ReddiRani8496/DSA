public class ElementInsertionPosition {
    public static int insertElement(int arr[], int n, int k) {
        int left = 0;
        int right =n-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(arr[mid]==k) {
                return mid;
            } else if(arr[mid]>k) {
                right = mid-1;
            } else {
                left = mid+1;
            }

        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6};
        int n = arr.length;
        int k = 4;
        int position = insertElement(arr, n, k);
        System.out.println(position);
    }
}
