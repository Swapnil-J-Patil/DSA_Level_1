package ArrayProblems.LeetcodeProblems;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] freq=new int[26];

        //Increasing the count at particular index
        for (char c: s.toCharArray()) {
           freq[c-'a']++;
        }
        //Decreasing the count at given index
        for (char c: t.toCharArray()) {
            freq[c-'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
