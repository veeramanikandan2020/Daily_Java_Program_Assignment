package week1.day7;

import java.util.Arrays;

public class ArraySquare {
	
	public static void squareSortedArray(int[] nums) {
	
	 int[] square = new int[5];
	 
     for(int i = 0;i<nums.length;i++)
     {
       square[i] = nums[i]*nums[i];
       
     }
     
     Arrays.sort(square);
     
     for ( int i : square) {
    	 System.out.println(i);
		
	}
     
	}

	public static void main(String[] args) {
		
		int[] arr = {10,2,3,4,5};
		
		squareSortedArray(arr);
		

	}

}
