package week2.day4.assignment;

/* Java Problem (6/20)
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than (n/2) times. 
 * You may assume that the majority element always exists in the array.
 * Example 1:
	Input: nums = [3,2,3]
	Output: 3
	
	Example 2:
	Input: nums = [2,2,1,1,1,2,2]
	Output: 2
 */

import java.util.Arrays;

public class MajorityElementOfArray {

	public static void majorityElement(int[] arr) 
	{
		Arrays.sort(arr); // 1,1,1,1,1,2,2,2,2,2,2,3,3,3

		int majority = arr[0];
		
		//for (int i = 1; i < arr.length; i++) {
			
			int count = 0;
			
			for (int j = 1; j < arr.length; j++) 
			{
				if(majority == arr[j])
				{
					count++;	
				}
				else
				{
					if(count > (arr.length)/2)
						majority = arr[j];
					else
						majority = arr[count+1];
				}
				
			}
			System.out.println(majority);
//			if(count > (arr.length)/2)
//			{
//				System.out.println(majority);
//			}
//			
	}	


//		for (int i = 0; i < arr.length; i++)
//		{
//			int count = 0;
//			
//			for (int j = i + 1; j < arr.length; j++) 
//			{
//				if (majority == arr[j])
//				{
//					count++;
//					i++;
//				}
//			}
//			if (count > ((arr.length) / 2))
//				return majority;
//			else
//				majority = arr[i+1];
//		}
//	}

	public static void main(String[] args) {
		// int[] num = {3,2,3};

		int[] num = { 2, 2, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 3, 3, 2, 2, 3 };

		majorityElement(num);
		
	}

}
