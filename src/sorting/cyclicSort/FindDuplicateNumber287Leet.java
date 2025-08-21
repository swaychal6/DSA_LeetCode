package sorting.cyclicSort;

public class FindDuplicateNumber287Leet {
	public static void main(String[] args) {
//	Input: nums = [1,3,4,2,2]
//			Output: 2
		int arr[]= {1,3,4,2,2};
		System.out.println(findDuplicate(arr));
	}

	public static int findDuplicate(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correctIndex = nums[i] - 1;

			if (nums[i] != nums[correctIndex]) {
				swap(nums, i, correctIndex);
			} else {
				i++;
			}
		}
		
		for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
               return nums[j];
            }
        }
		return -1;
	}

	static void swap(int arr[], int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
