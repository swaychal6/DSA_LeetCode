package binarysearch;

public class MountainArray {
    public static void main(String[] args) {

        int arr[]={1,3,4,5,7,8};

        // int target=11;

        System.out.println("program Started");

        System.out.println(MountainArrayUsingBinarySearchAlgo(arr));
    }

    private static int MountainArrayUsingBinarySearchAlgo(int arr[]){

        int start=0;
        int end=arr.length-1;

        while (start<end) {

            int mid= start+(end-start)/2;

            // if(arr[mid]<arr[mid-1]&& arr[mid]>arr[mid1]){
            //     return arr[mid];
            // }

            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        return start;
    }

}
