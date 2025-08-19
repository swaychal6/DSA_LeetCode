package binarysearch;

public class FindPeakElement_162 {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1}));
    }

    public static int findPeakElement(int[] arr) {

        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
    return start;
    }

}
