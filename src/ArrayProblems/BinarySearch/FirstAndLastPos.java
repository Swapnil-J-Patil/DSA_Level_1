package ArrayProblems.BinarySearch;

import java.util.Arrays;

//744. Find Smallest Letter Greater Than Target
public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,8,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    static int[] searchRange(int[] nums, int target)
    {
        int[] ans={-1,-1};
        int firstOccurrence=binarySearch(nums,target,true);
        int lastOccurrence=binarySearch(nums,target,false);

        ans[0]=firstOccurrence;
        ans[1]=lastOccurrence;

        return ans;

    }
    static int binarySearch(int[] arr,int target,boolean isStartIndex )
    {
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while (start<=end)
        {
            int mid= start+ (end - start) / 2;

            if(target< arr[mid])
            {
                end=mid-1;
            } else if (target> arr[mid]) {
                start=mid+1;
            }
            else
            {
                //Potential ans
                ans=mid;
                if(isStartIndex)
                {
                    end=mid -1;
                }
                else
                {
                    start=mid +1;
                }
            }
        }
        return ans;
    }
}
