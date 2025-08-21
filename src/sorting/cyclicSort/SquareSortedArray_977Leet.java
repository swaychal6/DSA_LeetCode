package sorting.cyclicSort;

import java.util.Arrays;

public class SquareSortedArray_977Leet {
	public static void main(String[] args) {

//		Input: nums = [-4,-1,0,3,10]
//				Output: [0,1,9,16,100]
//				Explanation: After squaring, the array becomes [16,1,0,9,100].
//				After sorting, it becomes [0,1,9,16,100].
		
		int arr[]= {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(arr)));


	}

	public static int[] sortedSquares(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			nums[i]=nums[i]*nums[i];
		}
		
		System.out.println(Arrays.toString(nums));
		
		for (int i = 1; i < nums.length; i++) {
			for (int j = i; j>0; j--) {
				if(nums[j]<nums[j-1]) {
					swap(nums, j, j-1);
				}
			}
		}
		return nums;
	}
	
	static void swap(int arr[], int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
