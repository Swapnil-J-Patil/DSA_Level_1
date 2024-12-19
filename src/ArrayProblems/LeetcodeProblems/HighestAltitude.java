package ArrayProblems.LeetcodeProblems;

//1732. Find the Highest Altitude

//Example 1:
//
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

    public int largestAltitudeOptimized(int[] gain) {

        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

    public static int largestAltitude(int[] gain) {
        int max=0;
        int start=gain[0];
        if(gain.length==1)
        {
            if(start>max)
            {
                max=start;
            }
            return max;
        }
        for (int i = 1; i < gain.length; i++) {
            if(start>max)
            {
                max=start;
            }
            start+=gain[i];
            if(start>max)
            {
                max=start;
            }
        }
        return max;
    }
}
