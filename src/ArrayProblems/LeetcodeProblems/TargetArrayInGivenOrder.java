package ArrayProblems.LeetcodeProblems;

//1389. Create Target Array in the Given Order
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> temp=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            temp.add(index[i],nums[i]);
        }
        for (int i=0;i<temp.size();i++)
        {
            nums[i]= temp.get(i);
        }
        return nums;
    }
}
