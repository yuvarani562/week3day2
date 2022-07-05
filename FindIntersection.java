package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	
	public static void main(String[] arg) {
		
Set<Integer>numbers1=new HashSet <Integer>();
Collections.addAll(numbers1, 3,2,11,4,6,7);

Set<Integer>numbers2= new HashSet<Integer>();
Collections.addAll(numbers2, 1,2,8,4,9,7);

ArrayList<Integer>i= new ArrayList<Integer>();
for (Integer j : numbers1) {
	if (numbers2.contains(j)) {
		i.add(j);
		
	}
}
	  
System.out.println("Intersections:"+i);
	}
	

}
