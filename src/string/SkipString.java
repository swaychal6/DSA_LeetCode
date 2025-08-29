package string;

public class SkipString {
    public static void main(String[] args) {

        String str="shuappleshubham";
        System.out.println(skip(str));
    }

    public static String skip( String str) {

        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if(str.startsWith("apple")){
            return skip(str.substring(5));
        }else{
            return ch+skip(str.substring(1));
        }
    }

    private static boolean isStrPresent(String str){

        if(str.isEmpty()){
            return false;
        }

        if(str.startsWith("apple")){
            return true;
        }else{
            return isStrPresent(str.substring(1,str.length()));
        }
    }
}
