package allBasicQuestions;

import java.util.*;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,4};
		
		System.out.println(findDuplicate(arr));
		
		System.out.println(findDuplicateKunal(arr));
		
		//allDuplicate
		
		System.out.println(findAllDuplicate(arr));
	}

	static int findDuplicate(int[] arr) {
		
		int small = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < small)
				small = arr[i];
		}
		
		int i=0;
		while(i<arr.length) {
			
			int correctIndex = arr[i] - small;
			
			if(correctIndex < arr.length && arr[i] != arr[correctIndex])
				
				arr[correctIndex] = arr[i] + arr[correctIndex] - (arr[i] = arr[correctIndex]);
			else
				
				i++;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j] != j+small)
				
				if(arr[j] == arr[arr[j]-1])
					
					return arr[j];
		}
		return -1;
	}
	
	static int findDuplicateKunal(int[] arr) {
		
		int i=0;
		while(i<arr.length) {
			
			if(arr[i] != (i + 1)) {
				
				int correctIndex = arr[i] - 1;
				
				if(arr[i] != arr[correctIndex]) {
					
					arr[correctIndex] = arr[i] + arr[correctIndex] - (arr[i] = arr[correctIndex]);
				}
				else {
					
					return arr[i];	
				}
						
			}else {
			
				i++;
			}
				
		}
		//System.out.println(Arrays.toString(arr));
		
		return -1;
	}
	
	static List<Integer> findAllDuplicate(int[]arr){
		
		List<Integer> ans = new ArrayList<>();
		
		//to find smallest number in an array
		int small = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] < small)
								
				small = arr[i];
		}
		
		//to sort array by correct index or skip it
		int j=0;
		
		while(j<arr.length) {
			
			int correctIndex = arr[j] - small;
			
			if((correctIndex < arr.length) && (arr[j] != arr[correctIndex])) 
				
				arr[j] = (arr[correctIndex] + arr[j]) - (arr[correctIndex] = arr[j]);
			else
				j++;
		}
		//System.out.println(Arrays.toString(arr));
		
		// return the element which is not in the correct index:
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] !=  (i + small)) {
				
				if(arr[i] == arr[arr[i]-1]) {
					
					ans.add(arr[i]);
					ans.add(i+small);
				}
			}
		}
		
		return ans;
	}

}
