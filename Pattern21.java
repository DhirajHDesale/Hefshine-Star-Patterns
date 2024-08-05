package practice;

public class Pattern21 {
	
	/*
	 
	  Draw This Pattern
	  
	  		* * * *
	  	  * * * *
	  	* * * *
	  * * * *
	    * * * *
	      * * * *
	        * * * *
	 */

	public static void main(String[] args) {
		
		int size = 4;
		for(int i = 1;i<=size;i++) {
			for(int j = i+1;j<=size;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=size;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1+1;i<=size;i++) {
			for(int j = 1+1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=size;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
