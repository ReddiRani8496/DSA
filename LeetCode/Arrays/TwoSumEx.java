// two sum problem using two pointer technique

import java.util.Arrays;

public class TwoSumEx {
    public static void main(String[] args) {
        int nums[]={2,5,8,1,4,9};
        int target = 10;
        Arrays.sort(nums);
        int low=0,end=nums.length-1;
        while(low<end){

            if((nums[low]+nums[end])==target){
                System.out.println("Element found");
                return ;
            }
            else if(nums[low]+nums[end]>target)
                end=end-1;
            else if(nums[low]+nums[end]<target)
                low=low+1;

        }

        System.out.println("Element not found");
    }
}
