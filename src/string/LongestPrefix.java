package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] arr = {  };
        System.out.println(longestprefix(arr));
    }


    private static String longestprefix(String strs[]){
        Map<String ,Integer> prefix=new HashMap<>();

        if(strs.length<1){
            return "";
        }

        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        int minLength=Math.min(first.length(),last.length());

        while(i<minLength && first.charAt(i)==last.charAt(i)){
            i++;
        }

        return strs[0].substring(0,i);

    }
}
