package ArrayProblems.BinarySearch;

public class PeakOfMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,1,0};
        System.out.println(peakOfSortedArray(arr));
    }
    static int peakOfSortedArray(int[] arr)
    {
        int start=0;
        int end=arr.length -1;

        //Here while loop runs till start is less than end
        while (start<end)
        {
            int mid=start + (end -start)/2;

            if(arr[mid]>arr[mid+1])
            {
                //We are in the des part of the array
                //But we don't know whether this is the largest element that's why end=mid
                //mid is 1,2,3,4,3,2,1,0 here mid will be 3 but that not the peak
                end=mid-1;
            }
            else {
                //else we are on the asc part of the array
                start=mid+1;
            }

        }
        return start;
    }
}
