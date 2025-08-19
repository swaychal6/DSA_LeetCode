package practice_code;

public class MissingNumber {
    public static void main(String[] args) {

        int arr[]={8,7,4,3,5,2,1};
        System.out.println(missingNumber(arr));;
    }


    public static int missingNumber(int arr[]){

        int n=arr.length+1;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
        sum=sum+arr[i];
        }

        int totalExpectSum=n*(n+1)/2;

        return totalExpectSum-sum;
    }
}
