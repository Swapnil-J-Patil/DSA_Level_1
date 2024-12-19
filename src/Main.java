//1920. Build Array from Permutation

import java.util.Arrays;

//1365. How Many Numbers Are Smaller Than the Current

/*Input: nums = [8,1,2,2,3]
        Output: [4,0,1,1,3]
        Explanation:
        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
        For nums[1]=1 does not exist any smaller number than it.
        For nums[2]=2 there exist one smaller number than it (1).
        For nums[3]=2 there exist one smaller number than it (1).
        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).*/
public class Main {
    public static void main(String[] args) {

        int[] arr={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNums(arr)));
    }
    public static int[] smallerNums(int[] arr)
    {
        int[] count=new int[101];
        int[] ans=new int[arr.length];
        for (int i: arr)
        {
            count[i]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[i]==0? 0: count[arr[i]-1];
        }
        return ans;
    }
}