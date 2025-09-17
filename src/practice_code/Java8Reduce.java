package practice_code;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Reduce {
    public static void main(String[] args) {
        int arr[] = {2, 5, 7};

        String s="shubham";


        String reduce = s.chars().mapToObj(value -> String.valueOf((char)value) )
                .reduce("",(s1, s2) -> s2+s1).toString();

        System.out.println(reduce);

        String string = s.chars()
                .mapToObj(value -> (char) value)
                .reduce("",(character, character2) -> character2 + character,(s1, s2) -> s1+s2).toString();

        System.out.println(string);

        Integer i = Arrays.stream(arr).boxed().reduce((integer, integer2) -> integer + integer2).get();
        System.out.println(i);

        System.out.println(Arrays.stream(arr).boxed().max((o1, o2) -> o1.compareTo(o2)).stream().skip(1).findFirst());;

        System.out.println(Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get());

    }
}
