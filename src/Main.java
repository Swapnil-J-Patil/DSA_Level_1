import java.util.*;


/*Input: n = 5
        Output: [-7,-1,1,3,4]
        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].*/

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,8,0,1));
    }

    static int binarySearch(int[] arr, int target, int start, int end)
    {

        while (start<=end)
        {
            int mid=start +(end -start)/2;

            if(start==end && target>arr[end])
            {
                end=end +(end -start +1)*2;
            }
            else if(start==end){
                break;
            }

            if(target < arr[mid])
            {
                    end=mid-1;
            }
            else if(target>arr[mid])
            {
                    start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}