package two_pointer;

import java.util.Arrays;

import static java.util.Collections.swap;

public class MoveNegativeNumberToLeft {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, -5};
        moveNegativeNumberToLeft(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveNegativeNumberToLeft(int arr[]){
        int left=0, right=0;

        while(right<arr.length){
            if(arr[right]>0){
                right++;
            }
            if(right<arr.length && arr[right]<0){
                swap(arr,left,right);
                left++;
                right++;
            }

        }
    }

    private static void swap(int arr[],int i,int j) {
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }
}
