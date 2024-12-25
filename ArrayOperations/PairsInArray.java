import java.util.Scanner;

public class PairsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        pairs(arr);
    }
    public static void pairs(int[] arr) {
        for(int i = 0; i < arr.length;i++) {
            for(int j=i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
