package week1.day2.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		int x[] = {3,2,11,4,6,7};
		int y[] = {1,2,8,4,9,7};
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					System.out.println("Intersection Number :" + (x[i]));
				}
				
			}
			
		}

	}

}
