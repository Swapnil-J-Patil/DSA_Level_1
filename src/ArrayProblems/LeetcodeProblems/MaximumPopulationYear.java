package ArrayProblems.LeetcodeProblems;

//1854. Maximum Population Year

//1950 <= birthi < deathi <= 2050

/*Example 1:

Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
        Example 2:

Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation:
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.*/

public class MaximumPopulationYear {
    public static void main(String[] args) {

    }
    public int maximumPopulation(int[][] logs) {
        int[] count = new int[101];

        for(int[] l: logs){
            int birth = l[0];
            int death = l[1];

            count[birth - 1950]++;
            count[death - 1950]--;

        }

        int max = count[0];
        int year = 1950;

        for(int i =1; i< count.length; i++){
            count[i] += count[i - 1];

            if(count[i] > max){
                max = count[i];
                year = 1950 + i;
            }
        }
        return year;
    }
}
