package sliding_window;

import java.util.HashSet;
import java.util.Set;

public class MaximumSumSubArray {
    public static void main(String[] args) {

        int arr[]={2, 1, 5, 1, 3, 2};
        int k=2;
        System.out.println(maxSumSumArray(arr,k));
        System.out.println(lonestSubString("abcabce"));
    }



    private static int maxSumSumArray(int arr[], int k){
        int maxSum = 0, windowSum = 0;

        for (int i = 0; i < k; i++) {  // first window
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];  // slide window
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;

    }

    private static String lonestSubString (String str){
        int left=0,right=0,startIndex=0,maxlength=0,n=str.length();
        Set<Character> set=new HashSet<>();
        while (right<n){

            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if(right-left+1>maxlength){
                maxlength=right-left+1;
                startIndex=left;
            }

            right++;

        }
        return str.substring(startIndex,startIndex+maxlength);
    }
}
