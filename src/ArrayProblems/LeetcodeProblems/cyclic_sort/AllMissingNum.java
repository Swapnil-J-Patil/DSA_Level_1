package ArrayProblems.LeetcodeProblems.cyclic_sort;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class AllMissingNum {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int index=0;
        List<Integer> ans=new ArrayList<>();
        while (index< nums.length)
        {
            int correctIndex=nums[index]-1;
            if(nums[index]!=correctIndex && index< nums.length && nums[correctIndex]!=nums[index])
            {
                swap(nums,index,correctIndex);
            }
            else {
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(i!=nums[i]-1)
            {
                ans.add(i+1);
            }
        }
        return ans;
    }
    public static void swap(int[] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
