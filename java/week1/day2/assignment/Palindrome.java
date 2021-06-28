package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String word1 = "malayalam";
		String word2 = "";
				
		for (int i = word1.length()-1 ; i >= 0 ; i--) {
			word2 = word2 + word1.charAt(i); 
		}
		if (word1.equals(word2)) {
			System.out.println("This word is Palindrome");
		}
		else {
			System.out.println("This word is not Palindrome");
		}
		
	}

}