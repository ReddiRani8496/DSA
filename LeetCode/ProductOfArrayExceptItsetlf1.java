package LeetCode;

public class ProductOfArrayExceptItsetlf1 {
    
        public int[] productExceptSelf(int[] nums) {
            
            int len = nums.length;
            int arr[] = new int[len];
            for(int i=0;i<len;i++){
                int product = 1;
                for(int j=0;j<len;j++){
                    if(i!=j)
                        product*=nums[j];
                }
                arr[i] = product;
            }
            return arr;
        }
    
    
}
