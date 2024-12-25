package Unique.ArrayProblems.TwoDArray;

//867. Transpose Matrix
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
public class TransposeMatrix {
    public static void main(String[] args) {

    }
    public int[][] transpose(int[][] matrix) {

        int row= matrix.length;
        int col= matrix[0].length;
        int[][] ans=new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
}
