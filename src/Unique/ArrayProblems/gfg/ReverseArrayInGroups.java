package Unique.ArrayProblems.gfg;

import java.util.Arrays;

public class ReverseArrayInGroups {
    public static void main(String[] args) {

        int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(reverseArray(arr,10)));
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
