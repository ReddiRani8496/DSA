import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>left[i-1]) {
                left[i] = arr[i];
            } else {
                left[i] = left[i-1];            }
        }
        System.out.println(Arrays.toString(left));
        right[arr.length-1] = arr[arr.length-1];
        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]>right[i+1]) {
                right[i] = arr[i];
            } else {
                right[i] = right[i+1];
            }
        }
        System.out.println(Arrays.toString(right));
        int water = 0;
        for(int i=0;i<arr.length;i++) {
            int minValue = Math.min(right[i],left[i]);
            int total = (minValue-arr[i]);
            if(total>0) {
                water+=total;
            }
        }
        System.out.println("total water: " + water);
    }
}
