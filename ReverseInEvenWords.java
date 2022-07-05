package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ReverseInEvenWords {
	public static void main(String[] arg) {
		List <Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(12);
		num.add(22);
		num.add(34);
		num.add(31);
		num.add(97);
		num.add(1154);
		num.add(32);
		num.add(2445);
		num.add(57);
		num.add(88);
		
		for(int i=0; i<num.size();i++) {
			if(num.get(i)%2==0) {
				System.out.println(num.get(i));
			}
			
		}
	}

}
