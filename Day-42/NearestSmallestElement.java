import java.util.Scanner;
import java.util.Stack;

public class NearestSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        nearestSmallestElement(arr,n);

    }
    public static void nearestSmallestElement(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int small = -1;
            for (int j = i-1; j > -1 ; j--) {
                if(arr[i] > arr[j]) {
                    small = arr[j];
                    break;
                }
            }
            System.out.print(small+" ");
        }
    }
    static void closestSmallElement(int arr[]){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() > arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty())
                System.out.print(-1+" ");
            else
                System.out.print(stack.peek()+" ");
            stack.push(arr[i]);
        }
    }
}
