package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TwoSumPair {
    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 2, 6, 5, 4}; // not sorted
        int target = 6;

        int[][] pairs = findPairs(arr, target);

        for (int[] p : pairs) {
            System.out.println(Arrays.toString(p));
        }
    }

    public static int[][] findPairs(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                result.add(new int[]{num, complement});
            }
            seen.add(num);
        }

        return result.toArray(new int[result.size()][]);
    }

}
