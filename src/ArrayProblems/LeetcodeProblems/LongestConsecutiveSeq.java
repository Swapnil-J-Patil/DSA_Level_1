package ArrayProblems.LeetcodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int[] arr={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        int res = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1)
            {
                count++;
            }
            else {
                res = Math.max(res, count);
                count=1;
            }
        }
        res = Math.max(res, count);
        return res;
    }

}
