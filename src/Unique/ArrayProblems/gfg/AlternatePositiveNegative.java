package Unique.ArrayProblems.gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveNegative {
    public static void main(String[] args) {

        int[] arr={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        System.out.println(Arrays.toString(rearrangeDigits(arr)));
    }

    static int[] rearrangeDigits(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg.add(arr[i]);
            } else {
                pos.add(arr[i]);
            }
        }

        int index=0;
        int posCount=0;
        int negCount=0;

        while(posCount< pos.size() && negCount< neg.size())
        {
            arr[index++]=pos.get(posCount++);
            arr[index++]=neg.get(negCount++);
        }

        //To add remaining elements in the array

        while (posCount< pos.size())
        {
            arr[index++]=pos.get(posCount++);
        }
        while (negCount< neg.size())
        {
            arr[index++]=neg.get(negCount++);
        }

        return arr;
    }
}
