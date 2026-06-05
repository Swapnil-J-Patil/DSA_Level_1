import java.util.Map;

public class Problem {

    private static final Map<Character, Integer> romanMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static void main(String[] args) {
       // System.out.println(romanToInt("LIII")); // 53
        System.out.println(romanToInt("IV"));   // 4
        System.out.println(romanToInt("IX"));   // 9
        System.out.println(romanToInt("MCMXC")); // 1990
    }

    static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));

            if (i < s.length() - 1 && current < romanMap.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
}