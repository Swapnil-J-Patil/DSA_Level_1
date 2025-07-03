package ArrayProblems.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={3,2,4,6,7,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Get the max element index and swap it with the last index and then reduce the array size
    //O(n2)
    static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex=arr.length-i-1;
            int maxIndex=maxElementIndex(arr,0,lastIndex);
            swap(arr,lastIndex,maxIndex);
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int maxElementIndex(int[] arr,int start, int last)
    {
        int max=start;
        for (int i = start; i <=last; i++) {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}
