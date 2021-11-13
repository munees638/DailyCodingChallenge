package dsa;

public class Permutation {

	public static void main(String[] args) {
		
		String word = "abc";
		
		permutation(word);

	}
	
	static void permutation(String word) {
		
		if(word.isEmpty()) {
			
			System.out.println(word);
			return;
		}
		
	}

}
