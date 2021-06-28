package randomAssignments;

public class AddString {
	public static void main(String[] args) {
		String cost1 = "Rs. 3000";
		String cost2 = "Rs. 4000";
		
		String replacedCost1 = cost1.replaceAll("\\D","" );
		String replacedCost2 = cost2.replaceAll("\\D", "");
		int parsedCoast1 = Integer.parseInt(replacedCost1);
		int parsedCost2 = Integer.parseInt(replacedCost2);
		int sum = parsedCoast1 + parsedCost2;
		System.out.println("The sum of cost is :" + sum);
		
	}

}
