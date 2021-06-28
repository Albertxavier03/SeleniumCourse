package week1.day2.assignment;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter= 0,
				number= 0,
				space= 0,
				specialCharacter= 0;
		char[] testArray = test.toCharArray();
		for (int i = 0; i < testArray.length; i++) {
			if (Character.isLetter(testArray[i])) {
				letter++;
			}
			else if (Character.isDigit(testArray[i])) {
				
				number++;
			}
			else if (Character.isSpaceChar(testArray[i])) {
				space++;
				
			}
			else {
				specialCharacter ++;
			}
		}
		System.out.println("Number of letters :" + letter);
		System.out.println("Number of numbers :" + number);
		System.out.println("Number of space :" + space);
		System.out.println("Number of special character :" + specialCharacter);

	}

}
