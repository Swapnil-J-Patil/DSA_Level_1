package Unique.ArrayProblems.gfg;
/*
https://www.geeksforgeeks.org/insert-an-adjacent-k-in-place-for-every-occurrence-of-it-in-the-array-keeping-the-size-of-the-array-intact/
*/

import java.util.Arrays;

public class InsertDuplicate {
    public static void main(String[] args) {
        int[] arr={1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println(Arrays.toString(insetDuplicate(arr,0)));
    }
    static int[] insetDuplicate(int[] arr, int k)
    {
        int[] ans=new int[arr.length];
        int arrIndex=0;
        int ansIndex=0;
        while (ansIndex<ans.length)
        {
            if(arr[arrIndex]!=k)
            {
                ans[ansIndex++]=arr[arrIndex++];

            }
            else
            {
                ans[ansIndex++]=k;
                if(ansIndex!=ans.length)
                {
                    ans[ansIndex++]=arr[arrIndex++];
                }

            }
        }
        return ans;
    }
}
