package practice_code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedElement {
    public static void main(String[] args) {

        String s="Java is High level programming language";

        Integer i = Arrays.stream(s.split(" ")).map(t -> t.length()).sorted(Comparator.reverseOrder())
                .findFirst().get();

        System.out.println("Highest word length: "+i);
        int arr[]={1,2,3,4,5,3,4,5};


        Map.Entry<Integer, Long> integerLongEntry = Arrays.stream(arr)
                .boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
                .findFirst()
                .get();


        System.out.println(integerLongEntry);

        System.out.println(" first repetative elemnt is : "+repetativeElement(arr));;
    }

    public static int repetativeElement(int arr[]){

        HashSet<Integer> num=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            boolean add = num.add(arr[i]);
            if(!add){
                return arr[i];
            }
        }
        return -1;
    }
}
