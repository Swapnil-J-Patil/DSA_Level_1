package ArrayProblems.LeetcodeProblems;

import java.util.Arrays;

//1480. Running Sum of 1d Array
public class RunningSum1DArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(sum(arr)));
    }

    static int[] sum(int[] arr)
    {
        if(arr.length==0 || arr.length==1)
        {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            int sum=arr[i-1]+arr[i];
            arr[i]=sum;
        }
        return arr;
    }
}

