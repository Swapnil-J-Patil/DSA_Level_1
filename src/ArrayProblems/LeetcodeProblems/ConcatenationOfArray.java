package ArrayProblems.LeetcodeProblems;

import java.util.Arrays;

//1929. Concatenation of Array
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(Arrays.toString(concatenate(arr)));
    }
    static int[] concatenate(int[] arr)
    {
        int[] ans=new int[arr.length *2];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[i];
            ans[i + arr.length]=arr[i];
        }
        return ans;
    }
}
