package Unique.ArrayProblems.TwoDArray;

//1572. Matrix Diagonal Sum

/*Input: mat = [[1,2,3],
        [4,5,6],
        [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.*/
public class DiagonalSum {
    public static void main(String[] args) {

        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        //Get the sum of elements with same row col values (corners)
        for (int i = 0; i < mat.length; i++) {
            sum+=mat[i][i];
        }

        //check if the length of the matrix is greater than 1
        if(mat.length>1)
        {
            //Add all the elements which are present at the middle of the matrix
            for (int i = 0; i < mat.length; i++) {
                sum+=mat[i][mat.length -i -1];
            }

            //if the size of the matrix is odd then subtract the elements
            if(mat.length % 2 == 1)
            {
                int middle=(mat.length- 1)/2;
                return sum - mat[middle][middle];
            }
        }
        return sum;
    }
}
