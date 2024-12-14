package Unique.ArrayProblems;

import java.util.Arrays;

//1920. Build Array from Permutation

/*Input: nums = [0,2,1,5,3,4]
        Output: [0,1,2,4,5,3]
        Explanation: The array ans is built as follows:
        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
        = [0,1,2,4,5,3]*/
public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr={5,0,1,2,3,4};
        System.out.println(Arrays.toString(optimizedPermute(arr)));
    }

    public static int[] optimizedPermute(int[] arr)
    {
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];
            ans[i]=arr[a];
        }
        return ans;
    }
    /*public static void permute(int[] arr)
    {
        int[] temp= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i]=temp[temp[i]];
        }
    }*/
}

