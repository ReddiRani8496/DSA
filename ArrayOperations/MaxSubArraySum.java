import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxSum = maxSubArraySum(arr);
        System.out.println("Max sum: " + maxSum);
    }

    private static int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                currentSum = 0;
                for(int k=i;k<=j;k++) {
                    currentSum += arr[k];

                }

                if(currentSum > maxSum) maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
