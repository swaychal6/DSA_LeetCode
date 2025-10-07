package string;

import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        System.out.println(isValidAnagram(s,t));
        System.out.println(isAnagram(s,t));

    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> count1 = new HashMap<>();
        HashMap<Character, Integer> count2 = new HashMap<>();
        count1 = count(count1, s);
        count2 = count(count2, t);
        return count1.equals(count2) ? true : false;
    }

    public static HashMap<Character, Integer> count(HashMap<Character, Integer> count, String str) {
        for(int i=0; i<str.length(); i++) {
            Character c=str.charAt(i);
            if(count.containsKey(c)) {
                count.put(c, count.get(c)+1);
                continue;
            }
            count.put(c, 1);
        }
        return count;
    }

    private static boolean isValidAnagram(String s, String t){

        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map1=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch=t.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        return map.equals(map1);
    }
}
