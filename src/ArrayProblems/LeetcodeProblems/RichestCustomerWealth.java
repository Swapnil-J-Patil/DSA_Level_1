package ArrayProblems.LeetcodeProblems;

//1672. Richest Customer Wealth
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,7},
                {3,2,1,5}
        };
        System.out.println(maxWealth(arr));
    }
    static int maxWealth(int[][] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j <arr[i].length; j++) {
                sum+=arr[i][j];
            }
            if(max<sum)
            {
                max=sum;
            }
        }
        return max;
    }
}
