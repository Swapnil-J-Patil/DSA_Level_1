package Unique.ArrayProblems.gfg;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(rotateArr(arr,2)));
    }
    static int[] rotateArr(int[] arr, int k)
    {
        int n= arr.length;
        int[] temp=new int[n];

        //To handle when k > n
        k%=n;

        //save last elements to the start of temp
        for (int i = 0; i < n-k; i++) {
            temp[i]=arr[k + i];
        }
        //Save first elements to the back of temp
        for (int i = 0; i < k; i++) {
            temp[n-k + i] = arr[i];
        }

        return temp;
    }

}
