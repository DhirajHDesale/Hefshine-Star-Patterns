package practice;

public class Pattern11 {

	/*
	 
	 Draw This Pattern
	 
	 * * * * * * *
	   * * * * *
	     * * *
	       *
	 
	 */
	public static void main(String[] args) {
		int size = 4;
		for(int i = 1;i<=size;i++) {
			for(int j = 1+1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j = i;j<=size;j++) {
				System.out.print("* ");
			}
			for(int j = i+1;j<=size;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
