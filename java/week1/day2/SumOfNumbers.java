package week1.day2;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int input = 123;
		int sum= 0;
		int rem ;
		
		while (input >0) {
			
			rem = input % 10;
			 System.out.println(rem);
			 sum = sum + rem ;
			 System.out.println(sum);
			 input = input / 10;
			 System.out.println(input);
			
		}
		
			System.out.println("The sum of the Number : " + sum);
	}

}
