package binarysearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        //Floor number is the number where the number is smaller or equal to target
        int arr[]={2,3,5,9,14,16,18};

        int target=10;

        System.out.println(BinarySearch(arr,target));
    }

    private static int BinarySearch(int[] arr, int target) {

        if(target<arr[0]){
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

        return end;
    }
}


