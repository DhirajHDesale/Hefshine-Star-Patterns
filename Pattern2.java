package practice;

public class Pattern2 {
	/*
	 draw this pattern 
      * 
    * * 
  * * * 
* * * * 


	 */

	public static void main(String[] args) {
		
		int size = 4;
		for(int i = 1;i<=size;i++) {
			for(int j = i+1;j<=size;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
