import java.util.Scanner;

public class SubArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        subArrays(arr);
    }
    public static void subArrays(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                for(int k=i;k<=j;k++) {
                    System.out.println(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
