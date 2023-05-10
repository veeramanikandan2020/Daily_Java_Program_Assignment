package week2.day5.assignment;
/*
 * Java Problem (7/20)
	Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

	Example 1:

	Input: nums = [1,2,3,1]
	Output: true
	Example 2:

	Input: nums = [1,2,3,4]
	Output: false
	Example 3:

	Input: nums = [1,1,1,3,3,4,3,2,4,2]
	Output: true
 */

public class ArrayDistinct {

	public static boolean isDistinctArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j])
					count++;

			}
			if (count >= 1)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		// int[] nums = { 1, 2, 3, 1 };
		// int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(isDistinctArray(nums));

	}

}
