package ArrayProblems.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //for 1D array
       /* int[] a=new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(a));*/

        //for 2D array
        int[][] arr=new int[3][4];
        for (int row = 0; row < arr.length; row++) //arr.length -> no of rows
        {
            for (int col = 0; col < arr[row].length; col++) { // length of row for particular index -> no of columns

               /* [1,2]     //here the no of column for index 0 is 2
                [4,5,6]     //here the no of column for index 1 is 3
                [7,8,9,10]  here the no of column for index 2 is 4                                       */
               // System.out.print("Enter element at row " + row + " and column " + col +": ");
                arr[row][col]=sc.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
