package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {


	public static void main(String[] args) {
		
		Integer[] data = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0
			
		
		
		
		List<Integer>numbers = new  ArrayList<Integer>();
		Collections.addAll(numbers,14,12,13,11,15,14,18,16,17,19,18,17,20 );
		int count ,i,j;
		for (i=0; i<=numbers.size()-1; i++) {
			count = 0;
			for(j=i+1; j<numbers.size(); j++) {
				if(numbers.get(i)==numbers.get(j)) {
				count++;	
					
				}
				if (count>0) {
					System.out.println(numbers.get(i));
					break;
				}
				
			}
		}
		
		
	
	}
	
	
		
	}

