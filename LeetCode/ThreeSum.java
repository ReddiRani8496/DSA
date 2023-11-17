package LeetCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    
     public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            HashSet<Integer> set = new HashSet<>();
            int current = 0-nums[i];
            for(int j=i+1;j<nums.length;j++) {
                int required = current-nums[j];
                if(set.contains(required)){
                    list1.add(nums[i]);
                    list1.add(nums[j]);
                    list1.add(nums[required]);
                    lists.add(list1);
                 //   list1.clear();
                }
                else 
                    set.add(nums[j]);

            }
        }
        return lists;
    }

}
