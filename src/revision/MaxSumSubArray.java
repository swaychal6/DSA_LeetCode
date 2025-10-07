package revision;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 2};
        int k = 3;
        System.out.println(maxSubArray(arr, k));
    }


    private static int maxSubArray(int arr[], int k) {

        int windowSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];

            if (i >= k - 1) {
                windowSum-= arr[i -(k-1)];
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}
