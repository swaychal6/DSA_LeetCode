package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {


        int arr[]={1,4,6,8,9,24,27,29,299};
//        binarySearchMethod(arr,8);
        System.out.println(binarySearchMethod(arr,29));

    }


    public static int binarySearchMethod(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end) {

             mid=end+(start-end)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]< target){
                start=mid+1;
            }

            if(arr[mid]>target){
                end=mid-1;
            }
        }

        return -1;
    }
}
