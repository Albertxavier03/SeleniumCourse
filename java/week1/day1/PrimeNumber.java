package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int number = 13;
		boolean prime = true ;
		
		for (int i = 2; i < number/2 ; i++) 
		{
			if (number % i == 0) {
				prime = false;
			}
		}
		if (prime) {
			System.out.println(number + " This number is a Prime Number");
		}
		else {
			System.out.println( number + " This number is not a Prime Number");
			}
	}

}
