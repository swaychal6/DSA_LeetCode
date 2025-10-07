package revision;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(str));
    }

    private static boolean isValidPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        if (str.isEmpty()) {
            return true;
        }

        while (left <= right) {
            char s = str.charAt(left);
            char e = str.charAt(right);

            if (!Character.isLetterOrDigit(s)) {
                left++;
            } else if (!Character.isLetterOrDigit(e)) {
                right--;
            } else {
                if (Character.toLowerCase(s) != Character.toLowerCase(e)) {
                    return false;
                }
                left++;
                right--;
            }

        }

        return true;
    }
}
