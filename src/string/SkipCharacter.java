package string;

public class SkipCharacter {
    public static void main(String[] args) {

        String ans = skip("bccaad");
        System.out.println(ans);
    }

    public static String skip( String str) {

        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if (ch == 'a') {
            return skip(str.substring(1));
        } else {
            return ch + skip( str.substring(1));
        }
    }
}
