
//1431. Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1480. Running Sum of 1d Array
/*
Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/

public class Main {
    public static void main(String[] args) {

        System.out.println(isPrime(4));
    }

    static boolean isPrime(int num)
    {
        if(num==2)
        {
            return true;
        }
        int div=2;
        while (div*div < num)
        {
            if(num%div ==0)
            {
                return false;
            }
            div++;
        }
        return div*div>=num;
    }

}