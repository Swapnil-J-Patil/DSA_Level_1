package ArrayProblems.BinarySearch;

public class BitonicArrarySearch {
    public static void main(String[] args) {
        int[] asc= {1,2,3,4,5};
        int[] des={5,4,3,2,1};

        System.out.println(binarySearch(asc,2));
        System.out.println(binarySearch(des,2));
    }
    static int binarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];

        while (start<=end)
        {
            int mid=start + (end -start)/2;

            if(target > arr[mid])
            {
                if(isAsc)
                {
                    start=mid+1;
                }
                else
                {
                    end=end-1;
                }
            }
            else if(target < arr[mid])
            {
                if(isAsc)
                {
                    end=mid-1;
                }
                else
                {
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
