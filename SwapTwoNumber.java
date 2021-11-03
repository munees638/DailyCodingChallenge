package allBasicQuestions;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		
		int num2 = in.nextInt();
		
//using third variable:
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
//using addition and sub:
		
//		num1 = num1 + num2;
//		num2 = num1 - num2;
//		num1 = num1 - num2;
		
//using multiplication and division:
		
//		num1 = num1 * num2;
//		num2 = num1 / num2;
//		num1 = num1 / num2;
		
//using bitwise operator:
		
//		num1 = num1 ^ num2;
//		num2 = num1 ^ num2;
//		num1 = num1 ^ num2;
		
// in single line:
		
//		num2 = (num1 + num2) - (num1 = num2);
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
