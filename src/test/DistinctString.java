package test;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctString {
    public static void main(String[] args) {
        String s = "sshhuuhhssggkk";

        String collect = s.chars().mapToObj(value -> String.valueOf( (char) value ))
                .distinct()
                .collect(Collectors.joining());

        System.out.println(collect);

        Map<String, Long> collect1 = s.chars().mapToObj(value -> String.valueOf((char) value))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect1);

        String reduce = s.chars().mapToObj(value -> String.valueOf((char) value))
                .collect(Collectors.toSet())
                .stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .reduce("", (a, b) -> a+b);

        System.out.println(reduce);
    }
}
