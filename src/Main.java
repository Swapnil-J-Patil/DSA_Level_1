import java.util.*;


/*Input: n = 5
        Output: [-7,-1,1,3,4]
        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].*/

public class Main {
    public static void main(String[] args) {

        System.out.println(isAnagram("cas", "tac"));

    }
    public static boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        int[] freq = new int[26];

        for (char c: s.toCharArray())
        {
            freq[ c - 'a']++;
        }

        for (char c: t.toCharArray())
        {
            freq[ c - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {

            if(freq[i] != 0)
            {
                return false;
            }
        }
        return true;
    }


}