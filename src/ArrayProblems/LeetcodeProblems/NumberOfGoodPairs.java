package ArrayProblems.LeetcodeProblems;

public class NumberOfGoodPairs {
    public static void main(String[] args) {

        int[] arr={1,2,3,1,1,3};
        System.out.println(numberOfGoodPairs(arr));
        System.out.println(numIdenticalPairs(arr));


    }
    public static int numIdenticalPairs(int[] A) {
        int ans = 0, count[] = new int[101]; //count will have {0,0,0,0, .....0} and we will keep on updating it to get no of occurrences of each element
        for (int a: A) {
            ans = ans + count[a]++;
        }
        return ans;
    }

    //BruteForce
    public static int numberOfGoodPairs(int[] arr)
    {

        int fast=1;
        int slow=0;
        int ans=0;
        while (slow<arr.length-1)
        {
            if(arr[slow]==arr[fast])
            {
                if(fast!=arr.length-1) {
                    ans++;
                    fast++;
                }
                else
                {
                    ans++;
                    slow++;
                    fast=slow+1;
                }
            }
            else if(fast== arr.length-1)
            {
                slow++;
                fast=slow+1;
            }
            else {
                fast++;
            }
        }
        return ans;
    }

    /*
Step | a (Current Element) | cnt[a] (Before Increment) | Increment to ans | New cnt[a] | ans
-----|---------------------|---------------------------|------------------|------------|-----
  1  |         1           |            0              |         0        |     1      |  0
  2  |         1           |            1              |         1        |     2      |  1
  3  |         1           |            2              |         2        |     3      |  3
  4  |         1           |            3              |         3        |     4      |  6
*/

    /*
Step | a (Current Element) | cnt[a] (Before Increment) | Increment to ans | New cnt[a] | ans
-----|---------------------|---------------------------|------------------|------------|-----
  1  |         1           |            0              |         0        |     1      |  0
  2  |         2           |            0              |         0        |     1      |  0
  3  |         3           |            0              |         0        |     1      |  0
  4  |         1           |            1              |         1        |     2      |  1
  5  |         1           |            2              |         2        |     3      |  3
  6  |         3           |            1              |         1        |     2      |  4
*/

  /*
  ans increments every time a number a is processed and its count in cnt is greater than 0. Specifically:

    For each element a, ans is incremented by the current value of cnt[a], which represents the count of previous occurrences of a.
    This works because each previous occurrence of a forms a "good pair" with the current a.
    */
}
