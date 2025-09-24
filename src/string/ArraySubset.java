package string;

import java.util.ArrayList;
import java.util.List;

public class ArraySubset {
    public static void main(String[] args) {

        int arr[]={1,2,3};
        List<List<Integer>> subset = subset(arr);

//        for (List<Integer> set:subset) {
//            System.out.println(set);
//        }

        fizzBuzz(15);
    }

    public static void fizzBuzz(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }

    static List<List<Integer>> subset(int arr[]){
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());

        for (Integer num: arr){
            int n=outer.size();

            for (int i = 0; i <n ; i++) {
                List<Integer>internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
