package string;

public class SubSequenceCheck {
    public static void main(String[] args) {

        System.out.println(isSubsequence("abc","aedycb",0,0));
    }

    private static boolean isSubsequence(String str,String target,int i,int j){

        if(i==str.length()){
            return true;
        }

        if(j==target.length()){
            return false;
        }

        if(str.charAt(i)==target.charAt(j)){
           return  isSubsequence(str,target,i+1,j+1);
        }else{
           return  isSubsequence(str, target, i, j+1);
        }
    }
}
