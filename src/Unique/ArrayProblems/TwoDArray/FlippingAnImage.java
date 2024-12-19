package Unique.ArrayProblems.TwoDArray;

//832. Flipping an Image

/*
Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
*/

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] input={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] arr=flipAndInvertImage(input);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }    }


    //Just swap and then invert 
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){ // Loop through each row
            for(int j = 0; j < (image[i].length + 1) / 2; j++){ // Loop through each column up to the middle of the row

                int temp = image[i][j] ^ 1; // Invert the value at (i, j)
                image[i][j] = image[i][image[0].length - j - 1] ^ 1; // Invert the value at the corresponding position from the other end
                image[i][image[0].length - j - 1] = temp; // Swap the two inverted values
            }
        }
        return image; // Return the modified image
    }
}
