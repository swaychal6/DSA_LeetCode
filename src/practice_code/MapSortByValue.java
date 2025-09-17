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
    }
}
