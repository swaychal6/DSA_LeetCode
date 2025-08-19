package binarysearch;

public class CeilingNumber {
    public static void main(String[] args) {

        //ceiling number is the number where number is greater or equal to target
        int arr[]={2,3,5,9,9,14,16,18};

        int target=15;

        System.out.println(BinarySearch(arr,target));
    }

    private static int BinarySearch(int[] arr, int target) {

        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while (start<=end) {

            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>=target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return start;
    }

}
