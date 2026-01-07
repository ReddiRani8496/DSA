public class SumOfSubsets {
     public static void main(String[] args) {

        int arr[] = {4,2,6,5,3,1};
        int sum = 10;
        System.out.println(sumOfSubSets(arr,0,sum));

    }
    public static int sumOfSubSets(int[] arr, int index, int sum) {
        if(sum==0) {
            return 1;
        } else if(sum<0 || index==arr.length) {
            return 0;
        }

        return sumOfSubSets(arr,index+1,sum-arr[index]) + sumOfSubSets(arr, index+1, sum);
    }
}
