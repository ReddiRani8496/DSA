import java.util.Scanner;

public class SumOfSubArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum =subArraySum(arr);
        System.out.println("Sum is : " + sum);

    }
    public static int subArraySum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i;j<arr.length; j++) {
                for(int k = i;k<=j;k++) {
                    sum += arr[k];

                }
                System.out.println("sum: " + sum);
            }
        }
        return  sum;
    }
}
