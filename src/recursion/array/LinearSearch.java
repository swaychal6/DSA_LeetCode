package recursion.array;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {


        int arr[]={1,3,2,44,55,33,9,9,9};
        System.out.println(findTargetIndex(arr,9,0));
        System.out.println(findAllIndex(arr,9,0,new ArrayList<>()));
    }

    static int findTargetIndex(int arr[], int target, int index){

        if(index==arr.length){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }

        return findTargetIndex(arr,target,index+1);
    }

    static ArrayList<Integer> findAllIndex(int arr[], int target, int index, ArrayList<Integer> list){

        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }

        return findAllIndex(arr,target,index+1,list);
    }
}
