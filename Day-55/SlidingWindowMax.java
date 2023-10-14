import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 4;
        maxSub(arr,k);
        maxSub1(arr,k);
    }
    public static void maxSub(int arr[],int k) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (deque.size()>0 && arr[i] >= arr[deque.peekLast()])
                deque.pollLast();
            deque.offerLast(i);
        }

        for (int i = k; i < arr.length; i++) {

            System.out.print(arr[deque.peekFirst()]+" ");

            while (deque.size()>0 && deque.peekFirst() <= i-k)
                deque.pollFirst();

            while (deque.size()>0 && arr[i] >= arr[deque.peekLast()])
                deque.pollLast();
            deque.offerLast(i);
        }
        System.out.println(arr[deque.peekFirst()]);
    }

    
    public static void maxSub1(int arr[], int k) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length-k; i++) {
            for (int j = i; j < i+k; j++) {
                if(arr[j]>max)
                    max = arr[j];
            }
            System.out.print(max+" ");
        }
        
    }
}
