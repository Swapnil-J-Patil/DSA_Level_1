
//1431. Kids With the Greatest Number of Candies

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(minCostToMoveChips(arr));
    }
    public static int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(oddCount, evenCount);
    }
}