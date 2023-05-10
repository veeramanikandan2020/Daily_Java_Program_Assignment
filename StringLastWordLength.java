package week1.day3.assignment;

public class StringLastWordLength {
	
	public static int WordLength(String word)
	{
		String [] split = word.split(" ");
		
		int len = split.length;
		
		return ((split[len-1]).length());
	}
	
	public static void main(String[] args) {
		
		//String s = "Hello World";
		
		String s = "fly me to  the moon";
		
		//String s = "luffy is still joyboy";
		
		System.out.println("String : " + s );
		System.out.println("Last word of String lenghth is :" + WordLength(s));

	}

}