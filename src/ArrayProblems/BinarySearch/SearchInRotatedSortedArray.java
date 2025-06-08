package ArrayProblems.BinarySearch;

//33. Search in Rotated Sorted Array
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,6));
    }
    static int search(int[] arr,int target)
    {
        int pivot=pivotOfArray(arr);
        int left=binarySearch(arr,target,0,pivot);
        if(left!=-1)
        {
            return left;
        }

        return binarySearch(arr,target,pivot+1,arr.length-1);

    }
    static int binarySearch(int[] arr, int target, int start, int end)
    {
        while (start<=end)
        {
            int mid=start +(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int pivotOfArray(int[] arr)
    {
        int start=0;
        int end=arr.length-1;

        while (start<end)
        {
            int mid=start + (end-start)/2;

            //Case1: 0,5,6,1,2 (mid: 6) mid > mid+1
            //Here we already got the largest element so return it
            //To prevent mid+1 exceeding the size of the array (mid < end)
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }

            //Case2: 2,3,4,5,1 (mid: 4) mid < mid -1
            //Here we already got the largest element so return it
            //To prevent mid-1 exceeding the size of the array (mid > start)
            if( mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            //Case3: 5,1,3 (mid: 1) mid <= start
            //Largest element lies on the left side
            if (arr[mid] <=arr[start]) {
                end=mid-1;
            }
            //Case4: 1,2,3,4,5 (mid: 3) mid > start
            //Largest element lies on the right side
            else {
                start=mid+1;
            }
        }
        return start;
    }
}
