import java.util.Scanner;

public class MaxColSum {
    public static void main(String[] args) {
        int[][] arr = takeInput();

        sum(arr);
    }

    private static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    private static void sum(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < columns; i++) {
            int sum = arr[0][i]; // arr[0][0] 1
            for (int j = 1; j < rows; j++) {
                sum += arr[j][i]; //
            }
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}
