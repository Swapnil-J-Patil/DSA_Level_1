import java.util.*;


/*Input: n = 5
        Output: [-7,-1,1,3,4]
        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].*/

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
    public static int[] sumZero(int n) {
        int[] ans=new int[n];
        int sum=0;
        for (int i = 1; i < n; i++) {
            ans[i]=i;
            sum+=ans[i];
        }
        int firstDigit= -1 * sum;
        ans[0]=firstDigit;
        return ans;
    }
}