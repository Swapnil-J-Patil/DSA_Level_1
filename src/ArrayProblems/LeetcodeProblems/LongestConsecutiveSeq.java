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
       Set<Integer> set= new HashSet<>();
       int ans=0;
       for (int i: nums)
       {
           int y=1;
           if(!set.contains(i-1))
           {
               y=i+1;
               while (i==y)
               {
                   y+=1;
               }
               ans=Math.max(ans,y-i);
           }
       }
       return ans;
    }
}
