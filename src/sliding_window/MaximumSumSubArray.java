package sliding_window;

public class MaximumSumSubArray {
    public static void main(String[] args) {

        int arr[]={2, 1, 5, 1, 3, 2};
        int k=3;
        System.out.println(maxSumSumArray(arr,k));
    }

    private static int maxSumSumArray(int arr[], int k){
        int windowSum=0,maxSum=0;

        for (int i = 0; i <arr.length ; i++) {
            windowSum+=arr[i];

            if(i>=k-1){
                maxSum=Math.max(maxSum,windowSum);
                windowSum=arr[i-(k-1)];
            }
        }

        return maxSum;
    }
}
