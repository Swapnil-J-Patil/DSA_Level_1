package ArrayProblems.LeetcodeProblems;

//https://leetcode.com/problems/missing-number/description/
public class MissingNum {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,0};
        System.out.println(missingNum(arr));
    }
    static int missingNum(int[] arr)
    {
        int index=0;
        while (index< arr.length){

            //As the range is from [0,n] we are not doing -1
            int correctIndex=arr[index];
            //Skip the missing number
            if(arr[index]< arr.length && arr[index]!=arr[correctIndex])
            {
                swap(arr,index,correctIndex);
            }
            else {
                index++;
            }
        }

        //Now check if there is any number who is not at current index
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr[i])
            {
                return i;
            }
        }
        return index;
    }

    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
