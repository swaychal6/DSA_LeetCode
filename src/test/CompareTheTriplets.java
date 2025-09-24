package test;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    public static void main(String[] args) {
        List<Integer> arr1=List.of(14,5,6);
        List<Integer> arr2=List.of(2,56,4);
        System.out.println(compareTriplets(arr1,arr2));
    }
    
    static List<Integer> compareTriplets(List<Integer> arr1, List<Integer> arr2){

        int first=0;
        int second=0;
        for (int i = 0; i < arr1.size() && i< arr2.size(); i++) {
            if(arr1.get(i)==arr1.get(i)){
                continue;
            }
            else if(arr1.get(i)<arr2.get(i)){
                second++;
            }else{
                first++;
            }
        }

        return List.of(first,second);
        
    }
}
