import java.util.Arrays;
import java.util.Scanner;

public class Sorting2DArrayRowWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sort(arr, rows, cols);
        System.out.println("Array after sorting: ");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sort(int[][] arr, int rows, int col) {
        for(int i=0;i<rows;i++) {
            for(int j=0;j<col;j++) {
               for(int k=0;k<col-j-1;k++) {
                   if(arr[i][k]>arr[i][k+1]) {
                       int temp = arr[i][k];
                       arr[i][k] = arr[i][k+1];
                       arr[i][k+1] = temp;
                   }
               }
            }
        }
       
    }
}
