package Unique.ArrayProblems.gfg;

import java.util.Arrays;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr= {10, 10, 10};
        System.out.println(secondLarge(arr));
    }
    static int secondLarge(int[] arr)
    {
        if(arr.length <=1)
        {
            return -1;
        }
        Arrays.sort(arr);
        if(arr[arr.length-1]==arr[arr.length -2])
        {
            return -1;
        }
        else
        {
            return arr[arr.length -2];
        }
    }
}
