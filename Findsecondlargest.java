package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Findsecondlargest {

	public static void main(String[] args) {
		
		List numbers = new ArrayList<Integer>();
		Collections.addAll(numbers, 3,2,11,4,6,7);
		Collections.sort(numbers);
		System.out.println("List of numbers:"+numbers);
		System.out.println("The second largest number is :"+numbers.get(4));
	
	}
	

}
