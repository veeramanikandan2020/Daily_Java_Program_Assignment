package week1.day4;

public class SquareRoot {
	
	public static int SqrtRoot(int num) {
				
		int i = 1, prod = 1;
		
		//System.out.println('Test string');
		
		while(prod <= num)
		{
			i++;
			prod = i * i;
		}
		return (i - 1);
		
	}

	public static void main(String args[]) {

		System.out.println(SqrtRoot(8));
		
		String a = "abc";
		
		String b = "abc";
		
		System.out.println(a.concat(b));
		
//		char c = 65;
//		
	System.out.println(5%2);
//		
//	
//		String S = "Java Quiz";
//		
//		
//		System.out.println(S.charAt(S.toUpperCase().length()));
//		
		
	}

}
