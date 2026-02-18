import java.util.*;


/*Input: n = 5
        Output: [-7,-1,1,3,4]
        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        System.out.println(greatestNum(arr, 3));
    }

    public static List<Boolean> greatestNum(int[] arr, int extra)
    {
        int max=getMax(arr);
        List<Boolean> sol = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] + extra >= max)
            {
                sol.add(i,true);
            }
            else
            {
                sol.add(i,false);
            }
        }
        return sol;
    }
    public static int getMax(int[] arr)
    {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max > arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
}