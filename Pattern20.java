package practice;

public class Pattern20 {
	
	/*
	 
	  
	  Draw This Pattern
	  
	  *  *
	  * *  * *
	  * * *   * * *
	  * * * *    * * * *
	   
	 */

	public static void main(String[] args) {
		
int size = 4;
for(int i = 1;i<=size;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.print("  ");
	for(int j = 1;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
