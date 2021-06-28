package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8;
		int num1 = 0;
		int num2 = 1;
		int sum;
		System.out.print( "0 ");
		for (int range1 = 1; range1 < 8;) 
		{
			sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
			range1++;
		}
		
	}

}
