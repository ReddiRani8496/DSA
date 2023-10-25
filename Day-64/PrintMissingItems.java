import java.util.Scanner;

public class PrintMissingItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = sc.nextInt();
        int high = sc.nextInt();
        printMissingItems(arr,low,high);

    }
    public static void printMissingItems(int[] arr,int low,int high) {
        for (int i = low+1; i < high; i++) {
            int j;
            for ( j = 0; j < arr.length; j++)
                if(arr[j]==i)
                    break;

            if(j==arr.length)
                System.out.print(i+" ");
        }
    }
}
