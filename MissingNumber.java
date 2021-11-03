package allBasicQuestions;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[]arr = {4,3,2,7,8,2,3,1};
		
		int ans = findMissingNumber(arr);
		
		System.out.println(ans);

	}
	
	static int findMissingNumber(int[]arr) {
		
		//to find smallest number in an array
		int small = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] < small) 
				
				small = arr[i];
		}
		
		//to sort array by correct index or skip it
		for(int i=0;i<arr.length;i++) {
			
			int correctIndex = arr[i] - small;
			
			if(correctIndex < arr.length && arr[i] != arr[correctIndex]) 
				
				arr[i] = arr[correctIndex] + arr[i] - (arr[correctIndex] = arr[i]);
		}
		
		// return the element which is not in the correct index:
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] !=  (i + small)) 
				
				return i + small;
		}
		
		return arr.length + small;
	}
}
