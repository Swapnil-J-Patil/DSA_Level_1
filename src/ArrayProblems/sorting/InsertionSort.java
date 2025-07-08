package ArrayProblems.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={3,2,4,6,7,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Here we move in chunks we sort first two elements then three and so on
    //O(n2)
    static void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]< arr[j-1])
                {
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
