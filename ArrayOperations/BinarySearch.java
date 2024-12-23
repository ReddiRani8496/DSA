import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        search(arr, target);
    }
    public static void search(int[] arr, int target) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid= (left + right) / 2;
            if(arr[mid]==target) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if(arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Element not found in the array");
    }
}
