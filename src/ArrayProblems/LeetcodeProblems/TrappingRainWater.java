package ArrayProblems.LeetcodeProblems;

//https://leetcode.com/problems/trapping-rain-water/description/
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr={2, 1, 5, 3, 1, 0, 4};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
       int[] left=new int[height.length];
       int[] right=new int[height.length];
       int res=0;

       //Creating left array to keep track of max elements from the left side
       // initializing with 0th element and starting with 1st element

        left[0]=height[0];
        for (int i = 1; i < height.length ; i++) {
            left[i]=Math.max(left[i-1],height[i]);
        }

        //Creating right array to keep track of max elements from the right side
        //initializing with last element and starting with 2nd last element
        right[height.length-1]=height[height.length-1];
        for (int i = height.length -2 ; i >=0; i--) {
            right[i]=Math.max(right[i+1],height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            res+=(Math.min(left[i],right[i]) - height[i]);
        }
        return res;
    }
}
