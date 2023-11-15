public class ProductExceptSelf2 {
    
        public int[] productExceptSelf(int[] nums) {
            
            int len = nums.length;
            int arr[] = new int[len];
            int product = 1;
            for(int i=0;i<len;i++) {
                product *= nums[i];
                arr[i]=product;
            }
            product = 1;
            for(int i=len-1;i>0;i--){
                arr[i]=arr[i-1]*product;
                product*=nums[i];
            }
            arr[0]=product;
            return arr;
        }
    
    
}
