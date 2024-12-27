package ArrayProblems.LeetcodeProblems;
//1. Two Sum
import java.util.*;

/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
public class TwoSum {
    public static void main(String[] args) {
    int[] arr={2,7,11,15};
        //System.out.println(Arrays.toString(twoSum(arr,50)));
        System.out.println(Arrays.toString(twoSumOptimized(arr,50)));

    }
    public static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i]))
            {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {1,2};
    }

    public static int[] twoSum(int[] nums, int target) {
        int slow=0;
        int fast=1;
        int[] ans=new int[2];
        while (slow< nums.length-1)
        {
            if(nums[slow]+nums[fast]==target)
            {
                ans[0]=slow;
                ans[1]=fast;
                return ans;
            }
            else if(fast!= nums.length-1){
                fast++;
            }
            else if(slow< nums.length-1 && fast== nums.length-1) {
                slow++;
                fast=slow+1;
            }

        }

        return ans;
    }
}
