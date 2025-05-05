package Unique.ArrayProblems;

//989. Add to Array-Form of Integer

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234*/
public class AddToArray {
    public static void main(String[] args) {
        int[] arr={1,2,0,0};
        //System.out.println(addToArrayForm(arr,34));
        System.out.println(addToArrayOptimized(arr,39));

    }

    public static List<Integer> addToArrayOptimized(int[] num, int k)
    {
        //Create a LinkedList with name as ans
        LinkedList<Integer> ans=new LinkedList<>();

        //create a variable i and initialize it with last index of array (num.length -1)
        int i=num.length -1;

        //Run a while loop till (i>=0 || k>0)
        while(i>=0 || k>0)
        {
            //To check if the current index is less than 0 or not
            if(i>=0)
            {
                k+=num[i--];
            }

            //Add remainder of k with 10 to the start of the LL ans with .addFirst(k%10)
            ans.addFirst(k%10);

            //Divide k by 10 and store it back to k
            k/=10;
        }

        //return the ans LL
        return ans;
    }
}
