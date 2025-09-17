package practice_code;

import java.util.List;
import java.util.stream.Stream;

public class MoveAllZeroToRightSide {
    public static void main(String[] args) {


        List<Integer> integers = List.of(-3, -2, 0, 4, 3, 2, 5, 0, 0);

        Stream<Integer> concat = Stream.concat(integers.stream().filter(integer -> integer != 0), integers.stream().filter(integer -> integer == 0));
        ;




        System.out.println(concat.toList());
    }
}
