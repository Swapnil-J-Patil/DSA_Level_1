package ArrayProblems.LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
