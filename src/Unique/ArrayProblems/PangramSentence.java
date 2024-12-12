package Unique.ArrayProblems;

import java.util.HashSet;
import java.util.Set;

//1832. Check if the Sentence Is Pangram
public class PangramSentence {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangramOptimized("thequickbrownfoxjumpsoverthelazydog"));

    }
    public static boolean checkIfPangramOptimized(String sentence) {
        for (char letter ='a'; letter <='z'; letter++){
            if (sentence.indexOf(letter) == -1 ){

                return false;
            }
        }
        return true;
    }

    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        {
            return false;
        }
        Set<Character> count=new HashSet<>();
        for (char c: sentence.toCharArray()) {
            count.add(c);
        }
        return count.size()==26;
    }

}
