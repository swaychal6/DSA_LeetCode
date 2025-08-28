package recursion;

public class ONE_TO_N {
    public static void main(String[] args) {

        ONEToN(1,16);
    }

    public static void ONEToN(int start,int n){
        if(start<=n){
            System.out.print(start+" ");
            ONEToN(start+1,n);
        }
        return;
    }
}
