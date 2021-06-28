package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyGroupOfNumbers {

	public static void main(String[] args) {
		String comapnyInfo = "Amazon has more than  51000 employes	 across 18 states in India";
		
		// create a pattern;
		String pat = "\\d+";
		
		// compile the pattern:
		Pattern comp = Pattern.compile(pat);
		
		// match the pattern with the input:
		Matcher match = comp.matcher(comapnyInfo);
		
		// print the group of numbers by matching the pattern with the input:
		while (match.find()) {
			System.out.println(match.group());
			
		}

	}

}
