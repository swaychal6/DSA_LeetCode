package sorting.cyclicSort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={3,0,1};
        System.out.println(cyclicSort(arr));
    }

    public static int cyclicSort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i];

            if(arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }

        return arr.length;
    }

     static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
