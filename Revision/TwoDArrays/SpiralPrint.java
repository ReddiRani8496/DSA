import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        boundary(arr);
    }

    private static void boundary(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        int top = 0, left = 0, bottom = rows - 1, right = columns - 1;

        // Loop until all elements are not traversed.
        while (top <= bottom && left <= right) {

            // For moving left to right
            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i]+" ");

            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right]+" ");

            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i]+" ");

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left]+" ");

                left++;
            }
        }


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
