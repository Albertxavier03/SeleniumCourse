package week1.day2.assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		String replacestr = str.replaceAll("[^a-zA-Z]", "");
		char[] strArray = replacestr.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			int count=1;
			for (int j = i+1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					count++;
					
				}
				
			}
			if (count > 1) {
				System.out.println("Char repeatedly occuring are :" + strArray[i]);
				
			}
		}

	}

}
