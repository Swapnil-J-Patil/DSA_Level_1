package ArrayProblems.LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1431. Kids With the Greatest Number of Candies

/*Example 1:

        Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]
        Explanation: If you give all extraCandies to:
        - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
        - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
        - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
        - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
        - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.*/
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
