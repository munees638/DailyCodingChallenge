package allBasicQuestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		System.out.println(findFactorial(num));
	}
	
	static int findFactorial(int num) {
		
		int factorial = 1;
		
		for(int i=1;i<=num;i++) {
			
			factorial *= i;
		}
		
		return factorial;
	}
}
