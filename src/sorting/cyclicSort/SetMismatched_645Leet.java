package sorting.cyclicSort;

import java.util.Arrays;

public class SetMismatched_645Leet {
	public static void main(String[] args) {
		
		int arr[]= {1,2,2,4};
		System.out.println(Arrays.toString(findErrorNums(arr)));
	}

	public static int[] findErrorNums(int[] nums) {
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

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j + 1) {
				return new int[] {nums[j],j+1};
			}
		}
		return new int [] {-1,-1};
	}

	static void swap(int arr[], int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
