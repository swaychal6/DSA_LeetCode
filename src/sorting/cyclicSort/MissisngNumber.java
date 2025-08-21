package sorting.cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissisngNumber {
	public static void main(String[] args) {

		int arr[]= {4,3,2,7,8,2,3,1};
		System.out.println(missingNumber(arr));
	}

	public static List<Integer> missingNumber(int[] arr) {
		int i = 0;
		ArrayList<Integer> list=new ArrayList<>();
		while (i < arr.length) {
			int correctIndex = arr[i]-1;

			if (arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                list.add(j+1);
            }
        }
		
		return list;
	}
	
	public static void swap(int[] arr, int first, int last) {
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}
}
