package week3.day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "PayPal India";
		char[] strArray = str.toCharArray();
		
		Set <Character> listArray = new LinkedHashSet<Character>();
		for (Character tempCharacter : strArray) {
			if ( tempCharacter != ' ') {
				listArray.add(tempCharacter);
			}
			
		}
		System.out.println(listArray);

	}

}
