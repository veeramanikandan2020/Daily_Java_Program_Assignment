package week1.day7;

public class BiggestArrayNumber {
	
	
	public static void main(String[] args) {

		//int[] num = {2,111,8,11,3,15};
		
		int[] num = {-2,-8,-1,-9,-5};
		
		int big = num[0];
		
	      for(int i = 0; i<num.length-1; i++)
	      {
	        if(big >= num[i+1])
	        {
	          big = big;
	        }
	        else
	        {
	          big = num[i+1];
	        } 
	        
	      }
	      System.out.println(big);

		}

}

