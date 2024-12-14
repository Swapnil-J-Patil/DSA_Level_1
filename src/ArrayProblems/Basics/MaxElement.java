package ArrayProblems.Basics;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={1,2,9,5,3,4};
        System.out.println(getMaxElement(arr));

        System.out.println(getMaxElementInRange(arr,3,10));
    }
    public static int getMaxElement(int[] arr)
    {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static int getMaxElementInRange(int[] arr,int start,int end)
    {
        int max=arr[start];
        if (start==end)
        {
            return arr[start];
        }
        if(start>end || start>arr.length-1 || end>arr.length-1)
        {
            return -1;
        }
        int startIndex = (start+1< end) ? start+1: start;
        for (int i = startIndex; i < arr[end]; i++) {
            if(arr[startIndex]> max)
            {
                max=arr[startIndex];
            }
        }
        return max;
    }
}
