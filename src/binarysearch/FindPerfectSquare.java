package binarysearch;

public class FindPerfectSquare {
    public static void main(String[] args) {
        System.out.println(findPerfectSqr(25));
    }

    public static boolean findPerfectSqr(int num){
        int start=0;
        int end=num;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid<num){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}
