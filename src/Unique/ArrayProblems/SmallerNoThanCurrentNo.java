package Unique.ArrayProblems;

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
public class SmallerNoThanCurrentNo {
    public static void main(String[] args) {
        int[] arr={8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumber(arr)));
        System.out.println(Arrays.toString(smallerNum(arr)));

    }

    public static int[] smallerNum(int[] arr)
    {
        //8, 1, 2, 2, 3
        int[] count=new int[101];

        int[] ans=new int[arr.length];
        for (int i : arr) {
            count[i]++;
        }
        //Count array becomes [0,1,2,1,0,0,0,0,1,0,0,....0]

        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];
        }
        // After the addition of previous element to current element count array becomes [0,1,3,4,4,4,4,4,5,5,5,....,5]

        for (int i = 0; i < arr.length; i++) {
            ans[i]=  arr[i] == 0? 0: count[arr[i]-1];
        }
        //Here we get value of element in count array at arr[i]-1 to get the number of smaller elements
        // e.g count[arr[0]-1] = count[8-1] = count[7] = 4
        //     count[arr[1]-1] = count[1-1] = count[0] = 0;
        //     count[arr[2]-1] = count[2-1] = count[1] = 1;
        //     count[arr[3]-1] = count[2-1] = count[1] = 1;
        //     count[arr[4]-1] = count[3-1] = count[2] = 3;

        return ans;//ans array becomes {4,0,1,1,3}

    }
    public static int[] smallerNumber(int[] arr)
    {
        int slow=0;
        int fast=1;
        int ans=0;
        int[] sol=new int[arr.length];
        while (slow< arr.length)
        {
            if(arr[slow]>arr[fast])
            {
                if(fast!=arr.length-1)
                {
                    ans++;
                    fast++;
                }
                else
                {
                    ans++;
                    sol[slow]=ans;
                    slow++;
                    fast=0;
                    ans=0;
                }
            }
            else if(fast==arr.length-1)
            {
                sol[slow]=ans;
                slow++;
                fast=0;
                ans=0;
            }
            else {
                fast++;
            }
        }
        return sol;
    }

}
