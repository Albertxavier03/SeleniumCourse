package week1.day2.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String input = "changeme";
		char[] word = input.toCharArray();
		for (int i = 0; i < word.length; i++) {
			if (i%2 == 0) {
				System.out.print(word[i]);
				
			}
			else {
				System.out.print(Character.toString(word[i]).toUpperCase());
			}
			
		}
		
		
		
	}
	}


