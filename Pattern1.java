package practice;

public class Pattern1 {
	/*
	 
	 //Draw this pattern
	  
	  * * * *
	  * * *
	  * * 
	  * 
	 
	 */

	public static void main(String[] args) {
	
		int size = 4;
		for(int i = 1;i<=size;i++) {
			for(int j = i;j<=size;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
