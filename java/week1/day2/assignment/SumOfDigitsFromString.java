package week1.day2.assignment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum= 0;
		String replaceText = text.replaceAll("\\D", "");
		System.out.println(replaceText);
		char[] chars = replaceText.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			sum = sum + Character.getNumericValue(chars[i]) ;			
		}
		System.out.println("The sum of the digits from string :" + sum);
		
		

	}

}
