package recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
    }

    static int reverseNumber(int n){

        int digit=(int)Math.log10(n)+1;
        return helper(n,digit);
    }

    static int helper(int n,int digits){

        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem * (int)(Math.pow(10,digits-1))+helper(n/10,digits-1);

    }
}
