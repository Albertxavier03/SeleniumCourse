package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZeroToLeft {

	public static void main(String[] args) {
		int[] num = {4,0,3,0,1,5,2,0};
		List<Integer> zeroValues = new ArrayList<Integer>();
		List<Integer> nonZeroValues = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			if (num[i]==0) {
				zeroValues.add(num[i]);
			}
			else {
				nonZeroValues.add(num[i]);
			}
		}
		for (Integer intNonZero : nonZeroValues) {
			System.out.print(intNonZero);
		}
		for (Integer intZero : zeroValues) {
			System.out.print(intZero);
		}
	}

}
