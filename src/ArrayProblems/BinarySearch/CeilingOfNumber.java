package ArrayProblems.BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,8};
        System.out.println(ceilingNum(arr,0));
        System.out.println(floorNum(arr,0));

    }
    static int ceilingNum(int[] arr,int target)
    {

        int start=0;
        int end=arr.length-1;

        //if the target is not in the array
        if(target> arr[end])
        {
            return -1;
        }

        while (start<=end)
        {
            int mid=start + (end-start)/2;
            if(target> arr[mid])
            {
                start=mid+1;
            }
            else if(target< arr[mid])
            {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
    static int floorNum(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        //if the target is not in the array
        if(target> arr[end])
        {
            return -1;
        }

        while (start<=end)
        {
            int mid=start + (end-start)/2;
            if(target> arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
