import java.util.*;


/*Input: n = 5
        Output: [-7,-1,1,3,4]
        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].*/

public class Main {
    public static void main(String[] args) {
        System.out.println(isPali(1212));
    }

    public static boolean isPali(int num)
    {
        int number=num;
        int ans=0;

        while (num > 0)
        {
            int rem = num % 10;
            ans= ans * 10 + rem;
            num/=10;
        }

        if(number == ans)
        {
            return true;
        }
        return false;
    }

}