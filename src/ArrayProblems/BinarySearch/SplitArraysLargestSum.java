package ArrayProblems.BinarySearch;

// https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArraysLargestSum {
    public static void main(String[] args) {
    int[] arr={7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }
    public  static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;

        //To get the range
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }

        while (start<end)
        {
            int mid=start + (end -start)/2;

            // Calculate how many pieces you can divide nums with it's max sum
            int sum=0;
            int pieces=1;

            for (int num : nums) {
                if(sum + num > mid)
                {
                    //You cannot add more data in the sub-array, make new one
                    sum=num;
                    pieces++;
                }
                else
                {
                    sum+=num;
                }
            }

            //Check if sub-arrays exceeds the k value
            if(pieces > k)
            {
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return start;
    }
}
