package ArrayProblems.LeetcodeProblems;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/description/
public class GroupedAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
        public static List<List<String>> groupAnagrams(String[] strs) {

            if(strs == null || strs.length == 0)
            {
                return new ArrayList<>();
            }

            Map<String, List<String>> anagramGroups = new HashMap<>();

            for(String str: strs)
            {
                char[] ch= str.toCharArray();
                Arrays.sort(ch);
                String sortedString = new String(ch);

                //Add a new key if the sortedString is not present
                if(!anagramGroups.containsKey(sortedString))
                {
                    anagramGroups.put(sortedString, new ArrayList<>());
                }

                anagramGroups.get(sortedString).add(str);
            }
            return new ArrayList<>(anagramGroups.values());
        }

}
