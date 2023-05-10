package week1.day7;

public class ArraySum {

	public static int[] twoSum(int[] nums, int target) {

		// write your code here

		int[] index = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target)

				{
					index[0] = i;
					index[1] = j;
					break;
				}
			}

		}
		return index;

	}

	public static void main(String[] args) {

		int[] a = { 3, 2, 4 };

		int[] arr = twoSum(a, 5);

		for (int i : arr) {
			System.out.println(i);

		}

	}

}
