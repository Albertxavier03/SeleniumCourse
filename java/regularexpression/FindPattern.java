package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPattern {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the valid mail ID: ");
		String mailId = input.nextLine();
		
		// assigning pattern for the input:
		String pat = "[a-z0-9.]+@[a-z]+.[a-z.]{2,}";
		
		// compile the pattern using - Compiler:
		Pattern comp = Pattern.compile(pat);
		
		// match whether the pattern and the input matches using - Matcher :
		Matcher match = comp.matcher(mailId);
		
		// print whether the input and the pattern matches as a boolean result:
		System.out.println("The given Mail ID : " + match.matches());
		
	}

}
