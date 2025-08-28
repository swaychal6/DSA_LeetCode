package test;

import java.util.*;

public class Main implements  Sample{
    public static void main(String[] args) {
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
}
