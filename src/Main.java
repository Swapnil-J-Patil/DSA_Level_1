import java.util.*;


/*Input: n = 5
        Output: [-7,-1,1,3,4]
        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].*/

public class Main {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        //System.out.println(Arrays.toString(twoSum(arr,50)));
        System.out.println(Arrays.toString(sum(arr,17)));
    }

    public static int[] sum(int[] arr,int target)
    {
        Map <Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            if(map.containsKey(target - arr[i]))
            {
                return new int[]{map.get(target -arr[i]),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }


}