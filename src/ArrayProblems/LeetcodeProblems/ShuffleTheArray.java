package ArrayProblems.LeetcodeProblems;

import java.util.Arrays;
//1470. Shuffle the Array

/*  Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

        Return the array in the form [x1,y1,x2,y2,...,xn,yn].
    Input: nums = [2,5,1,3,4,7], n = 3
        Output: [2,3,5,4,1,7]
        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].*/
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
