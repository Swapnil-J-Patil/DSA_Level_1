package Unique.ArrayProblems.gfg;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
    int[] arr={0, 0, 0, 0};
        System.out.println(maxOnesOrZeros(arr));
    }
    static int maxOnesOrZeros(int[] arr)
    {
        int c1=0;
        int c0=0;
        int m1or0=0;
        for(int i = 0; i <arr.length ; i++) {
            if(arr[i]==1)
            {
                c1++;
                m1or0=Math.max(m1or0,c1);
                c0=0;
            }
            else
            {
                c0++;
                m1or0=Math.max(m1or0,c0);
                c1=0;
            }
        }
        return m1or0;
    }
}
