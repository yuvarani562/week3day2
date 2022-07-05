package week3.day2;


import java.util.HashMap;
import java.util.Map;

public class FirstMostDuplicate {
	
	
	
	
	/*
	 * Psuedocode
	 * 
	 * 1) Map -> HashMap 
	 * 2) String -> ch[] -> Get all the character -> occurance
	 * 3) Keep comparing the occurance with other values -> max value -> character
	 * 
	 */
	 public static void main(String[] arg) {
		 
		 String input = "abbaba";
		 int count = 0;
		 char str = input.charAt(0);
		 Map <Character,Integer>map = new HashMap<Character,Integer>();	
		 char[] charArray = input.toCharArray();
		 for (int i=0; i<charArray.length; i++) {
			 map.put(charArray[i],map.getOrDefault(charArray[i],0)+1);
			 if (map.get(charArray[i])>count) {
				 str= charArray[i];
				 count = map.get(charArray[i]);
				 
			 }
		 }
		 System.out.println(str);
		 System.out.println(count);
	 }

}
