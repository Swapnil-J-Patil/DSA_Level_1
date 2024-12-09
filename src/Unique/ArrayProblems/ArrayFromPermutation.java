package Unique.ArrayProblems;

import java.util.Arrays;

//1920. Build Array from Permutation
public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr={5,0,1,2,3,4};
        System.out.println(Arrays.toString(optimizedPermute(arr)));

        System.out.println(Arrays.toString(arr));
    }

    public static int[] optimizedPermute(int[] arr)
    {
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];
            ans[i]=arr[a];
        }
        return ans;
    }
    /*public static void permute(int[] arr)
    {
        int[] temp= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i]=temp[temp[i]];
        }
    }*/
}

