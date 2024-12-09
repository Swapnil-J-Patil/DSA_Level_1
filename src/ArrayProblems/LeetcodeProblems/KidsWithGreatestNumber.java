package ArrayProblems.LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumber {
    public static void main(String[] args) {

        int[] arr={2,3,5,1,3};
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(greatestNum(arr,3));
    }
    public static List<Boolean> greatestNum(int[] arr, int extra)
    {
        int max=getMaxElement(arr);
        List<Boolean> ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]+extra >= max)
            {
                ans.add(i,true);
            }
            else
            {
                ans.add(i,false);
            }
        }
        return ans;
    }
    public static int getMaxElement(int[] arr)
    {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
