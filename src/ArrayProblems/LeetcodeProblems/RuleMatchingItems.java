package ArrayProblems.LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1773. Count Items Matching a Rule

/*Example 1:

        Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
        Output: 1
        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].*/

public class RuleMatchingItems {
    public static void main(String[] args) {
        List<List<String>> list=new ArrayList<>();
        list.add(Arrays.asList("phone", "blue", "pixel"));
        list.add(Arrays.asList("computer", "silver", "lenovo"));
        list.add(Arrays.asList("phone", "gold", "iphone"));
        System.out.println(countMatches(list,"color","silver"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index=0;
        int count=0;
        if(items.size()==0)
        {
            return count;
        }
        switch (ruleKey)
        {
            case("type"):
            {
                index=0;
                break;
            }
            case("color"):
            {
                index=1;
                break;
            }
            case("name"):
            {
                index=2;
                break;
            }
        }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).matches(ruleValue))
            {
                count++;
            }
        }
        return count;
    }
}
