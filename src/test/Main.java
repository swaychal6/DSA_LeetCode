package test;

import java.util.*;

public class Main implements  Sample{
    public static void main(String[] args) {

        simpleArraySum(List.of(3,2,1,4,5));

        Map<String, String> empToManager = new HashMap<>();
        empToManager.put("Ajay", "Ramesh");
        empToManager.put("Deepesh", "Animesh");
        empToManager.put("Mohan", "Ajay");
        empToManager.put("Rahul", "Mohan");



        String input = "Rahul";
        List<String> l1 = new ArrayList<>();
//        l1.add(input);
        String current = input;

        while (current != null) {
                l1.add(current);
                current = empToManager.get(current);
        }

        System.out.println(String.join("->", l1));
    }
    /**
     *
     */
    @Override
    public void gettingData() {

    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        Integer i = ar.stream().reduce((integer, integer2) -> integer2 + integer).get();
        System.out.println(i);
        return i;
    }

}
