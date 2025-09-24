package string;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {

        subSeq("","abc");
        ArrayList<String> abc = subSeqArray("", "abc");
        System.out.println(abc);
    }

    public static void subSeq(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }

    public static ArrayList<String> subSeqArray(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> last=new ArrayList<>();
            last.add(p);
            return last;
        }

        char ch=up.charAt(0);

        ArrayList<String> left= subSeqArray(p+ch,up.substring(1));
        ArrayList<String> right=subSeqArray(p,up.substring(1));

         left.addAll(right);

         return left;
    }
}
