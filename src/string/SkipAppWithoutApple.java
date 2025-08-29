package string;

public class SkipAppWithoutApple {
    public static void main(String[] args) {
        String str="shuapplshubham";
        System.out.println(skip(str));
    }

    public static String skip( String str) {

        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skip(str.substring(3));
        }else{
            return ch+skip(str.substring(1));
        }
    }
}
