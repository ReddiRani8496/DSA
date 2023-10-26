import java.util.HashSet;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        findSum(arr,target,n);
    }
    public static void findSum(int arr[],int target,int n) {
        for (int i = 0; i < n-2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int first = target-arr[i];
            for (int j = i+1; j < n; j++) {
                int required = first-arr[j];
                if(set.contains(required)){
                    System.out.println("Sum found "+arr[i]+" "+arr[j]+" "+required);
                    return;
                }
                set.add(arr[j]);
            }
        }
        System.out.println("Sum not found");
    }
}
