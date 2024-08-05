package practice;

import java.util.Scanner;

public class LeapYears {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Starting year and Ending Year");
		int start = s.nextInt();
		int end = s.nextInt();
		for(int i = start;i<=end;i++) {
			if((i%4==0 && i%100!=0)|| (i%400==0))
				System.out.println(i);
		}

	}

}
