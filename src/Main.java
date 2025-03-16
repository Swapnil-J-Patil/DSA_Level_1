import java.util.*;


/*Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234*/

public class Main {
    public static void main(String[] args) {
        int[] arr= {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
       int count=0;
        for (int i : nums) {
           int digits= (int) (Math.log10(i) +1);
           if(digits % 2 !=0)
           {
               count++;
           }
        }
        return count;
    }
}