package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
				
		int i;
		List<Integer>numbers= new ArrayList<Integer>();
		Collections.addAll(numbers, 12,3,4,7,6,8);
		Collections.sort(numbers);
		for (i = numbers.get(0); i<=numbers.size();i++){
			
			if (i!= numbers.get(i-1)) {
				
				System.out.println("Missing Number:"+i);
				break;
			}
		}

	}

}
