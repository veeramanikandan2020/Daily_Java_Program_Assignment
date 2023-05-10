package week1.day7;

public class OccuranceOfCharacter {

	public static int occurance(char[] str, char ch) {

		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == ch) {
				count++;
			}

		}

		return count;

	}

	public static void main(String[] args) {
		
		String str = "testleaf";
		
		char[] ch = str.toCharArray();
		
		System.out.println(occurance(ch,'a'));

	}

}
