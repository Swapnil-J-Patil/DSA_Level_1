package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4};
        System.out.println(firstNonRepeatingChar("abbac"));
    }

    private static char firstNonRepeatingChar(String s)
    {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for (char ch : s.toCharArray())
        {
            if(map.get(ch) == 1)
            {
                return ch;
            }
        }
        return '0';
    }


}