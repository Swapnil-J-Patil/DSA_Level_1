package ArrayProblems.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,2,4,6,7,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Compare each element individually and swap if the current element is greater than previous element
    //O(n2)
    static void bubbleSort(int[] arr)
    {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
