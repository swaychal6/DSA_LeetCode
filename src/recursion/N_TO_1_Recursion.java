package recursion;

public class N_TO_1_Recursion {
    public static void main(String[] args) {

        nTo1(3);
    }

    public static void nTo1(int n){
        if(n<=0){
            return ;
        }
        System.out.print(n+" ");
        nTo1(n-1);
    }
}
