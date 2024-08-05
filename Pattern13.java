package practice;

public class Pattern13 {
	
	/*
	 
	 Draw This Pattern
	 
	 - - - *
	 - - - *
	 - - - *
	 - - - *
	 
	 
	 */

	public static void main(String[] args) {
		
int size = 4;
for(int i = 1;i<=size;i++) {
	for(int j = 1;j<=size-1;j++) {
		System.out.print("- ");
	}
	for(int j = 1;j<=1;j++) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
