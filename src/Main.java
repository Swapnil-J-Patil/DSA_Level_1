
//1431. Kids With the Greatest Number of Candies

import java.util.*;

public class Main {
    public static void main(String[] args) {

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

}