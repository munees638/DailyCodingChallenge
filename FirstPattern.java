package patternProgramming;

public class FirstPattern {

	public static void main(String[] args) {
			
		starPattern();
		
		pattern1();
		
		pattern2();
	}
	
	static void starPattern() {
		
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}		
	}

	static void pattern1() {
		
		for(int end=1;end<=5;end++) {
			
			for(int val=end;val<=5;val++) {
				
				System.out.print(val + " ");
			}
			
			System.out.println();
		}		
	}
	
	static void pattern2() {
		
		for(int end=5;end>=1;end--) {
			
			for(int val=end;val>=1;val--) {
				
				System.out.print(val + " ");
			}
			
			System.out.println();
		}		
	}
}
