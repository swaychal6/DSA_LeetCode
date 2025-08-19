package binarysearch;

import java.util.Arrays;

public class FindFirstAndLastElement {

    public static void main(String[] args) {

        int arr[]={2,3,5,6,7,7,7,7,88};
        int target=7;

        System.out.println(Arrays.toString(findElementindex(arr,target)));
    }


    private static int [] findElementindex(int []nums,int target){
        int ans[]={-1,-1};
        ans[0]= searchelemnt(nums,target,true);

        if(ans[0]!=-1){
            ans[1]=searchelemnt(nums,target,false);
        }

        return ans;
    }

    private static int searchelemnt(int nums[],int target,boolean findStartIndex){


        int start=0;
        int end=nums.length-1;

        int ans=-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if(target<nums[mid]){
                start=mid+1;
            }else if(target>nums[mid]){
                end=mid-1;
            }else{
                ans= mid;

                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }

        return ans;
    }
}
