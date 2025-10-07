package backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSetArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> subset = subset(arr);

        for (List list : subset) {
            System.out.println(list);
        }
    }


    private static List<List<Integer>> subset(int arr[]) {

        List<List<Integer>> resultSets = new ArrayList<>();

        backtrack(resultSets, new ArrayList<Integer>(), arr, 0);

        return resultSets;
    }

    private static void backtrack(List<List<Integer>> resultSets,
                                  ArrayList<Integer> tempSet, int nums[], int start) {

        resultSets.add(new ArrayList<>(tempSet));

        for (int i = start; i < nums.length; i++) {
            tempSet.add(nums[i]);

            backtrack(resultSets, tempSet, nums, i + 1);

            tempSet.remove(tempSet.size() - 1);
        }
    }
}