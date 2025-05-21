package Unique.ArrayProblems.gfg;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr= {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
    }
    static int[] moveZerosToEnd(int[] arr)
    {
       int[] ans= new int[arr.length];
       int index=0;
       for (int i: arr)
       {
           if(i!=0)
           {
               ans[index]=i;
               index++;
           }
       }
       return ans;
    }
}
