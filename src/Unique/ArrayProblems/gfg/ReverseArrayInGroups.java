package Unique.ArrayProblems.gfg;

import java.util.Arrays;

public class ReverseArrayInGroups {
    public static void main(String[] args) {

        int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(reverseSubArrays(arr,3)));
    }

    static int[] reverseSubArrays(int[] arr, int k)
    {
        int n= arr.length;
        //Here incrementing the i value by kth times
        for (int i = 0; i < n; i+=k) {

            //Here initializing end with min value of end with minimum of i+k -1 and n-1 for out of bound scenario
            int start= i;
            int end= Math.min(i+k - 1, n-1);

            while (start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;
            }
        }
        return arr;
    }
    static int[] reverseArray(int[] arr, int k) {
        int[] ans = new int[arr.length];
        int[] temp = new int[k];
        int start = 0;
        int end = k;
        int ts=0;
        int te=k;
        int index=0;

        if(k> arr.length)
        {
            end=arr.length;
            te=arr.length;
        }
        while (end <= arr.length) {
            if (start !=te) {
                temp[index] = arr[end-1];
                start++;
                index++;
                end--;
            }
            else
            {
                index=0;
                for (int i = ts; i < te; i++) {
                    ans[i]=temp[index];
                    index++;
                }
                if((start+k)< arr.length) {
                    end=start + k;
                }
                else if(end==arr.length)
                {
                    break;
                }
                else
                {
                    end=arr.length;
                };
                //start--;
                ts=start;
                te=end;
                index=0;
            }

        }
        return ans;
    }

}
