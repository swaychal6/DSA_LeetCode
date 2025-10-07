package two_pointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int []arr={2,7,5,6};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }

    private static int [] twoSum(int arr[],int target){
        int left=0, right=arr.length-1,sum=0;

        while(left<=right){
            sum=arr[left]+arr[right];

            if(sum==target){
                return new int []{left,right};
            }

            if(sum<target){
                right--;
            }else{
                left++;
            }
        }
        return new int []{-1,-1};
    }
}
