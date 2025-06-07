package ArrayProblems.BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr={0,5,3,1};
        System.out.println(findInMountainArray(1,arr));
    }
    public static int findInMountainArray(int target, int[] arr) {
        int peak=peak(arr,target);
        if(arr[peak]==target)
        {
            return peak;
        }
        int left=binarySearch(arr,target,0,peak);
        if(left!=-1)
        {
            return left;
        }
        return binarySearch(arr,target,peak+1,arr.length-1);
    }

    static int peak(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while (start<end)
        {
            int mid=start +(end-start)/2;

            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr,int target, int start, int end)
    {
        boolean isAsc=arr[start]<arr[end];
        while (start<=end)
        {
            int mid=start + (end -start)/2;

            if(target>arr[mid])
            {
                if(isAsc)
                {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            } else if (target<arr[mid]) {
                if(isAsc)
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else
            {
                return mid;
            }
        }
            return -1;
    }
}
