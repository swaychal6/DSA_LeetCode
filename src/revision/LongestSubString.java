package revision;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str="abceabc";
        System.out.println(longestSubString(str));
    }


    private static String longestSubString(String str){
        int left=0,maxlength=0,startindex=0;

        Set<Character> set=new HashSet<>();
        for (int right = 0; right <str.length() ; right++) {
            char ch=str.charAt(right);
            while(set.contains(ch)){
                set.remove(ch);
                left++;
            }
            set.add(ch);

            if(right-left+1>maxlength){
                maxlength=Math.max(maxlength,right-left+1);
                startindex=left;
            }

            right++;
        }

        return str.substring(startindex,startindex+maxlength);
    }
}
