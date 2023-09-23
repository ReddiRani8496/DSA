import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        stackSpan(arr);
        stackSpan1(arr);
    }
    static void stackSpan(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int span = 1;
            for (int j = i-1; j >= 0; j--) {
                if(arr[j] > arr[i])
                    break;
                span++;
            }
            System.out.print(span+" ");
        }
        System.out.println();
    }
    static void stackSpan1(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()]<arr[i])
                stack.pop();
            if(stack.isEmpty())
                System.out.print((i+1)+" ");
            else
                System.out.print(i-stack.peek()+" ");
            stack.push(i);
        }

    }
}

