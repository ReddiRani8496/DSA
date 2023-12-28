package Revision;
import java.util.Stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
      //  int arr[]   = {3, 0, 2, 0, 4};
        int n = arr.length;
        trapRainWater(arr,n);
        trapRainWater1(arr,n);
        trapRainWater2(arr,n);
        trapRainWater3(arr,n);
        trapRainWater4(arr,n);
    }

    public static void trapRainWater(int[] arr,int n) {
        int water=0;
        for (int i = 1; i < n-1; i++) {
            int leftMax =arr[i];
            for (int j = 0; j < i; j++) {
                leftMax=Math.max(leftMax,arr[j]);
            }
            int rightMax = arr[i];
            for (int j = i+1; j < n; j++) {
                rightMax=Math.max(rightMax,arr[j]);
            }
            water+= Math.min(rightMax,leftMax)-arr[i];
        }
        System.out.println(water);
    }

    public static void trapRainWater1(int[] arr,int n) {
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0]=arr[0];

        for (int i = 1; i < n; i++) {
           leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }

        rightMax[n-1]=arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }

        int water = 0;

        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i],rightMax[i]) - arr[i];
        }
        System.out.println(water);
    }

    public static void trapRainWater2(int[] arr,int n) {
        int leftBar = arr[0];
        int rightBar= arr[n-1];
        int left = 0;
        int right = n-1;
        int water=0;
        while (left<=right) {
            if(leftBar<rightBar){
                if(arr[left]>leftBar) {
                    leftBar=arr[left];
                } else {
                    water+=leftBar-arr[left];
                    left++;
                }
            } else {
                if(arr[right]>rightBar){
                    rightBar=arr[right];
                } else {
                    water+=rightBar-arr[right];
                    right--;
                }
            }
        }
        System.out.println(water);
    }
    
    public static void trapRainWater3(int[] arr,int n) {
        Stack<Integer> stack = new Stack<>(); // O(n)
        int water=0;
        for (int i = 0; i < n; i++) {  // O(n)
            while ((!stack.isEmpty()) && (arr[stack.peek()]<arr[i])) {
                int pop_height = arr[stack.peek()];
                stack.pop();
                if(stack.isEmpty())
                    break;
                int distance = i-stack.peek()-1;
                int min_height = Math.min(arr[stack.peek()],arr[i])-pop_height;
                water += distance*min_height;
            }
            stack.push(i);
        }
        System.out.println(water);
    }

    public static void trapRainWater4(int[] arr,int n) {
        int block=0;
        int max_height=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_height = Math.max(max_height,arr[i]);
            block += arr[i];
        }

        int left=0,right=n-1,total=0;
        for(int i=1;i<=max_height;i++) {
            while (arr[left]<i)
                left++;
            while (arr[right]<i)
                right--;

            total += (right-left+1);
        }

        total -= block;
        System.out.println(total);
    }
}

