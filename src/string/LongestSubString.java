package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {

        int arr[] = {5, 3, 2, 4, 2, 2, 2};

        Integer[] array = Arrays.stream(arr).boxed().distinct().sorted().toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));

        String str = "abcdbcd";
        System.out.println(longestSubString(str));
        System.out.println(longestSubstring(str));
    }

    private static int longestSubString(String str) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int n = str.length();
        HashSet<Character> set = new HashSet<>();
        while (right < n) {
            char ch = str.charAt(right);

            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static String longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0, startIndex = 0;

        while (right < s.length()) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                startIndex = left;
            }
            right++;
        }
        return s.substring(startIndex, startIndex + maxLen);
    }
}
