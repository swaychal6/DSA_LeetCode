package binarysearch;

import java.util.HashSet;

public class CheckIfNandItsDoubleExist_1346 {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int []{7,1,14,11}));
    }


    public static boolean checkIfExist(int[] arr) {

        HashSet<Integer> set=new HashSet<>();

        for (int num:arr){

            if(set.contains(2*num)|| (num%2==0&& set.contains(num/2))){
                return true;
            }
                set.add(num);

        }
        return false;
    }
}
