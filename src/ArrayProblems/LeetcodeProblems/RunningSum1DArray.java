package ArrayProblems.LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//1480. Running Sum of 1d Array
/*Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
public class RunningSum1DArray {

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}

