package allBasicQuestions;

public class FiboncciSeries {

	public static void main(String[] args) {
		
		
		int first = -1, second = 1;
		
		
		while((first + second) <= 55) {
			
			//third = first + second;
			
			System.out.print((first + second) + " ");
			
			//third = first + second;
			
			second = first + second; // -1 + 1 = 0
			
			first = second - first;// 0 + 1 = 1
			
		}

	}

}
