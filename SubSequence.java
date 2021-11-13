package dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {

	public static void main(String[] args) {
		
		String a = "munees";
		
//		ArrayList<String> ans = longestPlaindrome1(a, "");
//		
//		System.out.println(ans);
//		
//		for(String word : ans) {
//			
//			if(word.length() != 1 && word.length() != 3 && isPlaindrome(word)) {
//				
//				System.out.println(word);
//				
//				break;
//			}
//		}
		
		 method(a);
		
	}
	
	static boolean isPlaindrome(String word) {
		
		String ans = "";
		
		for(int i=word.length() - 1;i>=0;i--) {
			
			ans = ans + word.charAt(i);
		}
		
		if(ans.equals(word)) {
			
			return true;
		}
		return false;
	}

	static ArrayList<String> longestPlaindrome(String word, String ans) {
		
		if(word.isEmpty()) {
			
			ArrayList<String> list = new ArrayList<String>();
			
			list.add(ans);
			
			return list;
		}
		ArrayList<String> left = longestPlaindrome(word.substring(1), ans + word.charAt(0));
		
		ArrayList<String> right = longestPlaindrome(word.substring(1), ans);
		
		left.addAll(right);
		
		return left;
	}
	
	static ArrayList<String> longestPlaindrome1(String word, String ans) {
		
		if(word.isEmpty()) {
			
			ArrayList<String> list = new ArrayList<String>();
			
			list.add(ans);
			
			return list;
		}
		ArrayList<String> left = longestPlaindrome1(word.substring(word.length()-1), ans);
		
		ArrayList<String> right = longestPlaindrome1(word.substring(1), ans);
		
		ArrayList<String> middle = longestPlaindrome1(word.substring(1, word.length()-1), ans);
		
		left.addAll(right);
		
		left.addAll(middle);
		
		return left;
	}
	
	static void method(String word) {
		
		for(int i=0;i<word.length();i++) {
			
			if(isPlaindrome(word.substring(i, word.length() - i))){
				
				System.out.println(word.substring(i, word.length() - i));
				break;
			}
			
			if(isPlaindrome(word.substring(i))) {
				
				System.out.println(word.substring(i));
				break;
			}
			
			if(isPlaindrome(word.substring(0, word.length() - i))) {
				
				System.out.println(word.substring(0, word.length() - i));
				break;
			}
						
		}
	}
}
