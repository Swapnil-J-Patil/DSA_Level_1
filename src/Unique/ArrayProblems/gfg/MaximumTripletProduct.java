package Unique.ArrayProblems.gfg;

import java.util.Arrays;

public class MaximumTripletProduct {
    public static void main(String[] args) {
    int[] arr={1, -4, 3, -6, 7, 0};
        System.out.println(maxProduct(arr));
    }
    static int maxProduct(int[] arr)
    {
        if(arr.length < 3)
        {
            return -1;
        }
        Arrays.sort(arr);
        int length= arr.length;
        //for two negative values if we take product of them then we will get bigger value e.g -4 * -6 * 7
        return Math.max(arr[length-1] * arr[length -2] * arr[length -3],arr[0] * arr[1] * arr[length -1]);
    }
}
