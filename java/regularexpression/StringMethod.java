package regularexpression;

public class StringMethod {

	public static void main(String[] args) {
		String comapnyInfo = "Amazon has more than  51,000 employes	 across 18 states in India";
		// to print only the numbers in the string:
		String replaceAll = comapnyInfo.replaceAll("\\D", "");
		System.out.println(replaceAll);

		
		  // to find how many words in the given string:
		String[] split1 = comapnyInfo.split("\\s+");
		System.out.println(split1.length);
		
		// to print the words:
		for (String everyWord : split1) {
			System.out.println(everyWord);
		}

	}

}
