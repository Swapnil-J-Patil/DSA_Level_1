package Unique.ArrayProblems.TwoDArray;

//1380. Lucky Numbers in a Matrix

import java.util.ArrayList;
import java.util.List;

/*A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
       */
public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        System.out.println(luckyNumbersOptimized(arr));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;

        List<Integer> rowMin=new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int rMin=Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                rMin=Math.min(rMin,matrix[i][j]);
            }
            rowMin.add(rMin);
        }

        List<Integer> colMax=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cMax=Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                cMax=Math.max(cMax,matrix[j][i]);
            }
            colMax.add(cMax);
        }

        List<Integer> luckyNum=new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]== rowMin.get(i) && matrix[i][j]== colMax.get(j))
                {
                    luckyNum.add(matrix[i][j]);
                }
            }
        }
        return luckyNum;
    }

    public static List<Integer> luckyNumbersOptimized(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            int[] rowMin = findRowMin(matrix, i);
            boolean isMax = findMax(matrix,rowMin[0],rowMin[1]);
            if(isMax){
                res.add(rowMin[0]);
            }
        }
        return res;
    }

    public static boolean findMax(int [][] matrix, int ele, int index){
        for (int[] ints : matrix) {
            if (ints[index] > ele) {
                return false;
            }
        }
        return true;
    }

    public static int[] findRowMin(int[][] matrix, int i){
        int min=matrix[i][0];
        int index =0 ;
        for(int j=1;j<matrix[i].length;j++){
            if(matrix[i][j]<min){
                min=matrix[i][j];
                index=j;
            }
        }
        return new int[]{min,index};
    }
}
