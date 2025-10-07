package practice_code;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSortByValue {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = Map.of(1, "shubham", 2, "sharvari", 3, "Biba");


        HashMap<Integer, String> collect = integerStringMap.entrySet().stream()
                .sorted(Comparator.comparing(integerStringEntry -> integerStringEntry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (string, string2) -> string, LinkedHashMap::new));


        System.out.println(collect);
        int arr[]={5,4,3,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int arr[],int start,int end){

        if(end-start==1){
            return ;
        }

        if (start<end){
            int mid=start+(end-start)/2;

            mergeSort(arr,start,mid);
            mergeSort(arr,mid,end);

            merging(arr,start,mid,end);
        }
    }

    private static void merging(int arr[],int start,int mid,int end){
        int mix[]=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;

        while(i<mid && j<end){

            if(arr[i]<arr[j]){
                mix[k++]=arr[i++];
            }else{
                mix[k++]=arr[j++];
            }
        }

        while(i<mid){
            mix[k++]=arr[i++];
        }

        while(j<end){
            mix[k++]=arr[j++];
        }

        for (int l = 0,m=start; l <arr.length && m<end ; l++,m++) {
            arr[m]=mix[l];
        }

    }
}
