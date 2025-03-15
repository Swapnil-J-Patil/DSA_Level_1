import java.util.*;


/*Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234*/

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,0,0};
        //System.out.println(addToArrayForm(arr,34));
        System.out.println(addToArrayOptimized(arr,39));

    }

    public static List<Integer> addToArrayOptimized(int[] num, int k)
    {
        LinkedList<Integer> ans=new LinkedList<>();
        int i=num.length-1;
        while (i>=0 || k >0)
        {
            if(i>=0)
            {
                k+=num[i--];
            }
            ans.addFirst(k%10);
            k/=10;
        }
        return ans;
    }
}