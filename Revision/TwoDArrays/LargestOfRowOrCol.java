import java.util.Scanner;

public class LargestOfRowOrCol {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        largestOfRowOrCol(arr);
    }

    private static void largestOfRowOrCol(int[][] arr) {
        int maxSum = Integer.MIN_VALUE, index =-1;
        boolean isRows=false;
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            int sum = arr[i][0];
            for (int j = 1; j < cols; j++) {
                sum+=arr[i][j];
            }
            if(sum>maxSum) {
                maxSum = sum;
                index = i;
                isRows = true;
            }
        }
        for (int i = 0; i < cols; i++) {
            int sum = arr[0][i];
            for (int j = 1; j < rows; j++) {
                sum+=arr[j][i];
            }
            if(sum>maxSum) {
                maxSum = sum;
                index = i;
                isRows = false;
            }
        }
        if(isRows)
            System.out.println("Row "+index+" "+maxSum);
        else
            System.out.println("Column "+index+" "+maxSum);

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


}
