package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator object = new Calculator();
		int summ = object.addition(10, 20, 30);
		int subb = object.substraction(50, 10, 20);
		double mull = object.multiplication(25, 4);
		float divv = object.division(100, 4);
		System.out.println("Sum :" + summ);
		System.out.println("Sub :" + subb);
		System.out.println("Multiplication :" + mull);
		System.out.println("Division :" + divv);

	}

}
