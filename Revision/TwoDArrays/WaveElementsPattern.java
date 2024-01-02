import java.util.Scanner;

public class WaveElementsPattern {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        printElements(arr);
    }

    private static void printElements(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        for (int i = 0; i < columns; i++) {
            if(i%2==0) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            }
            else {
                for (int j = rows-1; j >= 0; j--) {
                    System.out.print(arr[j][i]+" ");
                }
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
