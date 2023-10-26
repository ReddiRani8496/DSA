import java.util.Arrays;
import java.util.Scanner;

public class FourSum {
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
       
            int start, end;
            
            Arrays.sort(arr);
 
            for (int i = 0; i < n - 3; i++)
            {
                for (int j = i + 1; j < n - 2; j++) {
                    start = j + 1;
                    end = n - 1;
                    while (start < end) {
                        if (arr[i] + arr[j] + arr[start] + arr[end] == target) {
                            System.out.println(arr[i]+" "+arr[j]+" "+arr[start]+" "+arr[end]);
                            start++;
                            end--;
                        }
                        else if (arr[i] + arr[j] + arr[start] + arr[end] < target)
                            start++;
                        else 
                            end--;
                    } 
                } 
            }
        }
}

