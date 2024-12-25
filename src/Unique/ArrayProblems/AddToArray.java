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
        System.out.println(addToArrayForm(arr,34));
        System.out.println(addToArrayOptimized(arr,39));

    }

    public static List<Integer> addToArrayOptimized(int[] num, int k)
    {
        LinkedList<Integer> ans=new LinkedList<>();
        int i=num.length -1;

        while(i>=0 || k>0)
        {
            //To check if the current index is less than 0 or not
            //Adding the digits to k and saving it in LinkedList (faster than normal list)
            if(i>=0)
            {
                k+=num[i--];
            }
            ans.addFirst(k%10);
            k/=10;
        }
        return ans;
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        int power=0;
        double a=0;
        for (int i = num.length-1; i >=0; i--) {
            a+= num[i]*Math.pow(10,power);
            power++;
        }
        long ans= (long)a + k;
        List<Integer> sol=new ArrayList<>();
        while (ans>0)
        {
            long rem=ans%10;
            sol.addFirst((int)rem);
            ans=ans/10;
        }
        return sol;
    }
}
