
//1431. Kids With the Greatest Number of Candies

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3};
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