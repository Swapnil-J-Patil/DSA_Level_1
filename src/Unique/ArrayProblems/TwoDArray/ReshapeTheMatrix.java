package Unique.ArrayProblems.TwoDArray;
//566. Reshape the Matrix

/*Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]*/
public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2},
                {3,4},
        };
        int[][] ans=matrixReshape(arr,1,4);
        for (int i = 0; i < ans[0].length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] reshapedMatrix = new int[r][c];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshapedMatrix[index / c][index % c] = mat[i][j];
                index++;
            }
        }

        return reshapedMatrix;
    }
}
