package dsa;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		
		int target = 40;
		
		int ans = binarySearch(arr, target, 0, arr.length-1);
		
		System.out.println(ans);

	}
	static int binarySearch(int[] arr, int target) {
		
		int first = 0;
		int last = arr.length-1;
		
		while(first <= last) {
			
			int mid = first + (last - first) / 2;
			
			if(target > arr[mid])
				
				first = mid + 1;
				
			else if(target < arr[mid])
				
				last = mid - 1;
			else
				return first;
				
		}
		
		return last;
	}
// By Recursion
	static int binarySearch(int[]arr, int target, int first, int last) {
		
		int mid = first + (last - first) / 2;
		
		if(first <= last) {
			
			if(arr[mid] == target)
				
				return mid;
			
			else if(target > arr[mid])
				
				return binarySearch(arr, target, mid+1, last);
			
			return binarySearch(arr, target, first, mid-1);
		}
		
		return 0;
	}
}
