package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {1, 10}, {15, 18}};
        int[][] merged = merge(intervals);
        for (int[] i : merged) System.out.println(Arrays.toString(i));
    }


    private static int[][] merge(int arr[][]) {
        Arrays.sort(arr,(o1, o2) -> o1[0]-o2[0]);
        List<int []> result=new ArrayList<>();
        int current[]=arr[0];

        for (int [] interval:arr){
            if(interval[0]<=current[1]){
                current[1]=Math.max(current[1],interval[1]);
            }else{
                result.add(current);
                current=interval;
            }
        }

        result.add(current);
        return result.toArray(new int[result.size()][]);
    }
}
