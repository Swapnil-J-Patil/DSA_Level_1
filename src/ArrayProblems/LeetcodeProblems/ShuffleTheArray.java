package ArrayProblems.LeetcodeProblems;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffleArray(arr,3)));
    }
    static int[] shuffleArray(int[] arr,int n)
    {
        int[] ans=new int[arr.length];
        for (int i = 0; i < n; i++) {

            ans[2*i]=arr[i];
            ans[2*i+1]=arr[i+n];
        }
        return ans;
    }
}
