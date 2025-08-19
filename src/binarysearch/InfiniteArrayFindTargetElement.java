package binarysearch;

public class InfiniteArrayFindTargetElement {
    public static void main(String[] args) {

        int arr[]={3,4,5,6,7,8,9,22,33,44,55,66,88,99};
        int target=9;
        System.out.println(ans(arr,target));;
    }


    private static int ans(int arr[],int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int tempStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = tempStart;
        }

        return searchelemnt(arr,target,start,end);
    }

    private static int searchelemnt(int nums[], int target, int start,int end) {
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

