package recursion.mergesort;

import java.util.Arrays;

public class MergeSortArrayLeet_88 {
    public static void main(String[] args) {

        int arr[]={1,2,3,0,0,0};
        int arr2[]={2,5,6};
        int m=3,n=3;
//        nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        merge(arr,m,arr2,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int mix[]=new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                mix[k++]=nums1[i++];
            }else{
                mix[k++]=nums2[j++];
            }
        }

        while(i<m){
            mix[k++]=nums1[i++];
        }

        while(j<n){
            mix[k++]=nums2[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            nums1[l]=mix[l];
        }

    }
}
