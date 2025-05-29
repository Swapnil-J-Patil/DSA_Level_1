package Unique.ArrayProblems.gfg;

public class RemoveAllOccurrence {

    public static void main(String[] args) {
        int[] arr={0, 1, 3, 0, 2, 2, 4, 2};
        System.out.println(removeAllOccurrence(arr,2));
    }
    static int removeAllOccurrence(int[] arr, int k)
    {
        int ans=0;
        for (int i: arr)
        {
            if(i!=k)
            {
                ans++;
            }
        }
        return ans;
    }
}
