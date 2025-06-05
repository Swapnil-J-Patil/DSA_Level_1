package ArrayProblems.BinarySearch;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(targetArray(arr,11));
    }
    static int targetArray(int[] arr, int target)
    {
        return binarySearch(arr,target,0,1);
    }
    static int binarySearch(int[] arr,int target, int start, int end)
    {

        while (start<=end)
        {
            int mid= start+ (end - start) / 2;

            //Here to check if the size of the array is not reached  then increase the end by size of the array * 2 or not
            if(start==end && target> arr[end])
            {
                end=end +(end - start + 1)*2;
            }
            else {
                break;
            }
            if(target< arr[mid])
            {
                end=mid-1;
            } else if (target> arr[mid]) {
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
