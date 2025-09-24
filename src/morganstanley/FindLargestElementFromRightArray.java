package morganstanley;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLargestElementFromRightArray {
    public static void main(String[] args) {

        String str="HappyNewYear";

        String collect = str.chars().mapToObj(value -> String.valueOf((char)value)).distinct().collect(Collectors.joining());

        System.out.println(collect);

        int arr[]={17,5,16,7,9};
        findAllLargestElemntFromRight(arr);

    }

    static void findAllLargestElemntFromRight(int arr[]){
        List<Integer> list=new ArrayList<>();
        int maximumNum=arr[arr.length-1];
        list.add(maximumNum);
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]>maximumNum){
                maximumNum=arr[i];
                list.add(arr[i]);
            }
        }

        System.out.println(list.reversed());

    }
}
