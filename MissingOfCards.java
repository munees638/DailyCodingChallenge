package dsa;

import java.util.*;

public class MissingOfCards
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    int num = in.nextInt();
	    
	    String[] arr = new String[num];
	    
	    int k = 0;
	    
	    for(int i=1;i<=num;i++){
	        
	        String w1 = in.next();
	        
	        String w2 = in.next();
	        
	        arr[k++] = toFind(w1, w2);
	    }
	    
	    for(String i : arr){
	        
	        System.out.println(i);
	    }

	}
	
	static String toFind(String w1, String w2){
	    
        String w3 = w1.length() < w2.length() ? w1 : w2;
        
	    String w4 = w1.length() > w2.length() ? w1 : w2;
	    
	    int i = 0, k = 0;
	    
	    String finalAns = "";
	    
	    while(i<w3.length()){
	        
	        char minChar = (char)Math.min((int) w3.charAt(i), (int)w4.charAt(k));
	        
	        if(minChar == w3.charAt(i)){
	            
	           i++;
	            
	        }else{
	            
	            k++;
	        }
	        
	        finalAns = finalAns + minChar; 
	       
	    }
	    
	    for(int j = k;j<w4.length();j++){
	        
	        finalAns = finalAns + w4.charAt(j);
	    }
	    
	    return finalAns;
	}
}