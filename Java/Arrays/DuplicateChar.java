package Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String A = "guptaat";
		
		//1st wat
//		Set<Character> a = new HashSet<>();
//		
//	    for (int i = 0; i < A.length(); i++) 
//			if(!a.add(A.charAt(i)))
//				{
//				 	System.out.println("rejected at " + A.charAt(i));
//				}
	    
	    //2nd way
		
		char[] newchar =  A.toCharArray();
		Arrays.sort(newchar);
		
		for (int i = 1; i < newchar.length; i++) {
			if(newchar[i] == newchar[i-1])
			{
				System.out.println("rejected at " + newchar[i]);
			}
		}		
	    
	    
	}
	    
	}


