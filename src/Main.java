import java.util.*;


/*Input: n = 5
        Output: [-7,-1,1,3,4]
        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].*/

public class Main {
    public static void main(String[] args) {
        int[] arr={2, 1, 5, 3, 1, 0, 4};
        System.out.println(trappedWater(arr));
    }
    public static int trappedWater(int[] arr)
    {
        int[] left=new int[arr.length];
        int[] right= new int[arr.length];
        int res=0;

        left[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i]=Math.max(left[i-1],arr[i]);
        }

        right[right.length-1]= arr[arr.length-1];
        for (int j = right.length-2; j >=0 ; j--) {
            right[j]=Math.max(right[j+1],arr[j]);
        }

        for (int i = 0; i < arr.length ; i++) {
            res+=Math.min(left[i],right[i]) - arr[i];
        }
        return res;
    }
}