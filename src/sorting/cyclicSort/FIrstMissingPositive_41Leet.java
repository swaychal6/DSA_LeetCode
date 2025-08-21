package sorting.cyclicSort;

public class FIrstMissingPositive_41Leet {
	public static void main(String[] args) {
//		nput: nums = [1,2,0]
//				Output: 3
//				Explanation: The numbers in the range [1,2] are all in the array.
//				Example 2:
//
//				Input: nums = [3,4,-1,1]
//				Output: 2
//				Explanation: 1 is in the array but 2 is missing.
		int arr[] = { 1 };
		System.out.println(firstMissingPositive(arr));
	}

	public static int firstMissingPositive(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correctIndex = nums[i] - 1;

			if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
				swap(nums, i, correctIndex);
			} else {
				i++;
			}
		}

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j + 1) {
				return j + 1;
			}
		}
		return nums.length + 1;
	}

	static void swap(int arr[], int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
