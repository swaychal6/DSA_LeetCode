package sorting.cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicate_442Leet {
	public static void main(String[] args) {
//		Input: nums = [4,3,2,7,8,2,3,1]
//				Output: [2,3]
		int arr[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(arr));
	}

	public static List<Integer> findDuplicates(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correctIndex = nums[i] - 1;

			if (nums[i] != nums[correctIndex]) {
				swap(nums, i, correctIndex);
			} else {
				i++;
			}
		}
		
		System.out.println(Arrays.toString(nums));

		ArrayList<Integer> list = new ArrayList<>();
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j + 1) {
				list.add(nums[j]);
			}
		}
		return list;
	}

	static void swap(int arr[], int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
