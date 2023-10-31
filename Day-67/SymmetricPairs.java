import java.util.HashMap;
import java.util.Scanner;

public class SymmetricPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols =sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        symmetricPairs(arr);
    }
    public static void symmetricPairs(int[][] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int[] x : arr) {
            int first = x[0];
            int second = x[1];
            Integer required = map.get(second);
            if (required != null && required == first)
                System.out.println(first + " " + second);
            else
                map.put(first, second);
        }
    }
    
    public static void symmetricParisNaive(int[][] arr,int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < rows; j++) {
                if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.print("(");
                    System.out.print(arr[i][0]);
                    System.out.print(", ");
                    System.out.print(arr[i][1]);
                    System.out.print(")");
                    System.out.println();
                }
            }
        }
    }
}
