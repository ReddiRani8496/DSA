import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 4;
        maxSub(arr,k);
    }
    public static void maxSub(int arr[],int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (deque.size()>0 && arr[i] >= arr[deque.peekLast()])
                deque.pollLast();
            deque.offerLast(i);
        }
        for (int i = k; i < arr.length; i++) {
            System.out.println(arr[deque.peekFirst()]);
            while (deque.size()>0 && deque.peekFirst() <= i-k)
                deque.pollFirst();
            while (deque.size()>0 && arr[i] >= arr[deque.peekLast()])
                deque.pollLast();
            deque.offerLast(i);
        }
        System.out.println(arr[deque.peekFirst()]);
    }
}

