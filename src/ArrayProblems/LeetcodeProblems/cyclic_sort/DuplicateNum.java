package ArrayProblems.LeetcodeProblems.cyclic_sort;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int index=0;

        while (index< nums.length)
        {
            int correctIndex=nums[index]-1;
            if(nums[index]!=nums[correctIndex])
            {
                if(nums[index]!=index+1)
                {
                    swap(nums,index,correctIndex);
                }
                else {
                    return index+1;
                }
            }
            else {
                index++;
            }
        }

        return nums[index-1];
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
