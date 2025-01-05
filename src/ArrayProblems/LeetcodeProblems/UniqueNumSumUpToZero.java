package ArrayProblems.LeetcodeProblems;
//1304. Find N Unique Integers Sum up to Zero

import java.util.Arrays;

/*Input: n = 5
        Output: [-7,-1,1,3,4]
        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].*/
public class UniqueNumSumUpToZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
    public static int[] sumZero(int n) {
        int[] res=new int[n];
        int sum=0;
        for(int i=1;i<n;i++)
        {
            res[i-1]+=i;
            sum+=res[i-1];
        }
        res[n-1]= -1 * (sum + 0);//Replace 0 with the sum you want.e.g 21
        return res;
    }

}
