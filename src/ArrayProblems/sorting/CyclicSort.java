package ArrayProblems.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        //1,2,3,4,5
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr)
    {
        int index=0;
        while (index< arr.length){
            int correctIndex=arr[index]-1;
            if(arr[index]!=arr[correctIndex])
            {
                swap(arr,index,correctIndex);
            }
            else {
                index++;
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
