package Unique.ArrayProblems.TwoDArray;

//1252. Cells with Odd Values in a Matrix

/*Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.*/

// https://chatgpt.com/share/6763f268-0fc8-800b-b7cf-188fd35ac574

public class CellsWithOddValues {
    public static void main(String[] args) {

        int[][] arr={
                {0,1},
                {1,1}
        };
        System.out.println(oddCells(2,3,arr));
    }
    public static int oddCells(int m, int n, int[][] indices) {

        int count=0;
        int[] row=new int[m];
        int[] col=new int[n];

        for(int[] x: indices)
        {
            row[x[0]]++;
            col[x[1]]++;
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((row[i]+col[j]) % 2 !=0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
