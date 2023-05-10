package week1.day7;

import java.util.Arrays;

public class ArraySingleElement {

//	Java Challenge (4/20)
//
//	Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//	You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//	Example 1:
//
//	Input: nums = [2,2,1]
//	Output: 1
//	Example 2:
//
//	Input: nums = [4,1,2,1,2]
//	Output: 4
//	Example 3:
//
//	Input: nums = [1]
//	Output: 1

	public static void singleElementOfArray(int[] arr) {

		// Sort array in ascendening order
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					i++;
				}

			}

			if (count == 0) {
				System.out.println(arr[i]);

			}

		}

	}

	public static void main(String[] args) {

		int[] arr1 = {4,1,2,2,1};

		//int[] arr1 = { 2, 1, 2 };
		
		//int[] arr1 = {1};

		singleElementOfArray(arr1);

	}

}
