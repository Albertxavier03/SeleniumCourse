package week3.day1;

public class Calculator {

	public void add(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		System.out.println("Add1 :" + sum);

	}
	public void add(int num1, int num2, int num3) {
		int sum;
		sum = num1+ num2 +num3;
		System.out.println("Add2 :" + sum);

	}
	public void multiply(int num1, int num2) {
		int multi;
		multi = num1 * num2;
		System.out.println("Multi1 :" + multi);
	}
	public void multiply(int num1, double num2) {
		double multi;
		multi = num1 * num2;
		System.out.println("Multi2 :" + multi);

	}
	public void subtract(int num1, int num2) {
		int sub;
		sub = num1 - num2;
		System.out.println("Sub1 :" + sub);

	}
	public void subtract(int num1, double num2) {
		double sub;
		sub = num1 - num2;
		System.out.println("Sub2 :" + sub);

	}
	public void divide(int num1, int num2) {
		int div;
		div = num1 / num2;
		System.out.println("Div1 :" + div);

	}
	public void divide(double num1, int num2) {
		double div;
		div = num1 / num2;
		System.out.println("Div2 :" + div);

	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(2, 5);
		cal.add(4, 5, 6);
		cal.subtract(10, 5);
		cal.subtract(8, 4.5);
		cal.multiply(5, 8);
		cal.multiply(10, 6.56);
		cal.divide(18, 6);
		cal.divide(4.88, 2);

	}

}
