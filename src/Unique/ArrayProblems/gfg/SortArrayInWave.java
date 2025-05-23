package Unique.ArrayProblems.gfg;

import java.util.Arrays;

public class SortArrayInWave {
    public static void main(String[] args) {
        int[] arr = {10, 90, 49, 2, 1, 5, 23};
        System.out.println(Arrays.toString(sortInWave(arr)));
    }
    static int[] sortInWave(int[] arr)
    {
        for (int i = 0; i < arr.length; i+=2) {

            if(i> 0 && arr[i-1]> arr[i])
            {
                swap(arr,i-1,i );
            }

            //in case of 10,6,5 do the swap and get: 10,6,5
            // check if the index is less than last element index

            if(i < arr.length -1 && arr[i + 1] > arr[i])
            {
                swap(arr,i+1,i);
            }
        }
        return arr;
    }
    static void swap(int[] arr, int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
