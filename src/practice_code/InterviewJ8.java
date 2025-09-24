package practice_code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewJ8 {

    public static void main(String[] args) {

        String str="babac";

        Map<Character, Long> collect = str.chars().mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        String collect1 = collect.entrySet().stream()
                .map(t -> t.getKey() + "" + t.getValue())
                .collect(Collectors.joining());

        System.out.println(collect1);

        String s="Apple banana box been";
        char ch='b';

        List<String> collect2 = Arrays.stream(s.split(" "))
                .filter(string -> string.startsWith(String.valueOf(ch)))
                .collect(Collectors.toList());

        System.out.println(collect2);
    }
}
