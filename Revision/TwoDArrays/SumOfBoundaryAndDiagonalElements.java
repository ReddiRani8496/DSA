import java.util.Scanner;

public class SumOfBoundaryAndDiagonalElements {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        System.out.println(boundary(arr)+firstDiagonal(arr)+secondDiagonal(arr));
    }

    private static int boundary(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        int sum = 0;
        int i=0,j=0;
        for(j=0;j<columns;j++) {
            sum += arr[i][j];
        }

        j=columns-1;
        for (int k = 1; k < rows; k++) {
            sum += arr[k][j];
        }

        i=rows-1;
        for (int k = columns-2; k >= 0 ; k--) {
            sum += arr[i][k];
        }

        j=0;
        for (int k = rows-2; k > 0 ; k--) {
            sum += arr[k][j];
        }
        return sum;
    }

    private static int firstDiagonal(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        int sum = 0;
        int i=1,j=1;
        while (i<rows-1 && j<columns-1) {

            sum+= arr[i][j];
            i++;
            j++;
        }
        return sum;
    }
    private static int secondDiagonal(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        int sum = 0;
        int i=1,j=columns-2;
        while (i<rows-1 && j>0) {
            if(i==j) {
                i++;j--;
                continue;
            }
            sum+= arr[i][j];
            i++;
            j--;

        }
        return sum;
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
