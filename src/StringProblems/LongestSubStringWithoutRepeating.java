package StringProblems;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abac"));
    }
        public static int lengthOfLongestSubstring(String s) {
            int[] index = new int[128];
            int maxLength = 0;

            for (int right = 0, left = 0; right < s.length(); right++) {
                char ch = s.charAt(right);

                left = Math.max(left, index[ch]);
                maxLength = Math.max(maxLength, right - left + 1);
                index[ch] = right + 1;
            }

            return maxLength;
        }

}
