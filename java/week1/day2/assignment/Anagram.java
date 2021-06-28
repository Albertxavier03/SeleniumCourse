package week1.day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String word1 = "adobe";
		String word2 = "abode";
		
		if (word1.length()== word2.length()) {
			char arr1[] = word1.toCharArray();
			char arr2[] = word2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			System.out.println(arr1);
			System.out.println(arr2);
			if (arr1.equals(arr2)) {
				System.out.println("These words are Anagram");
			}

			else {
				System.out.println("These words are not Anagram");
			}
			}
		else {
			System.out.println("It is not Anagram");
		}
	}
}
		
		

		
	


