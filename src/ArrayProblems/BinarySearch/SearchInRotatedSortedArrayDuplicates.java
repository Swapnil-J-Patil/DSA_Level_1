package ArrayProblems.BinarySearch;

public class SearchInRotatedSortedArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {9,2,9,9,9};
        System.out.println(search(arr, 2));
    }

    static int search(int[] arr, int target) {
        int pivot = pivotOfArray(arr);
        int left = binarySearch(arr, target, 0, pivot);
        if (left != -1) {
            return left;
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int pivotOfArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            //Case1: 0,5,6,1,2 (mid: 6) mid > mid+1
            //Here we already got the largest element so return it
            //suppose mid+1 exceeds the size of the array
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            //Case2: 2,3,4,5,1 (mid: 4) mid < mid -1
            //Here we already got the largest element so return it
            //suppose there is no element for mid -1
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //Suppose start, end, middle have equal values then decrease start and end by 1
            //[2,2,9,2,2,2]
            if(arr[start]==arr[mid] && arr[mid]==arr[end] )
            {
                //What if start is Pivot [9,2,9,9,9]
                if(arr[start] > arr[start+1])
                {
                    return start;
                }
                start++;

                //What if end is Pivot [9,9,9,10,9]
                //Rotation can be from both sides
                if(arr[end]<arr[end-1])
                {
                    return end-1;
                }
                end--;
            }
            //Now if the left side is sorted, then check the right side,
            else if(arr[start] < arr[mid] || arr[mid]==arr[start] && arr[mid]>arr[end]){
                start=mid+1;
            }
            //If not then search the left side
            else {
                end=mid-1;
            }
        }
        return start;
    }
}
