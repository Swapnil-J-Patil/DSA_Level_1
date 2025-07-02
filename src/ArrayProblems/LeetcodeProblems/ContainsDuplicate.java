package ArrayProblems.LeetcodeProblems;

import java.util.HashMap;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i : nums) {
            if(hashMap.containsKey(i))
            {
                return true;
            }
            hashMap.put(i,1);
        }
        return false;
    }
}
