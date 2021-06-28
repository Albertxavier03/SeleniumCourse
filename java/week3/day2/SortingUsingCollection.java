package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> listInput = new ArrayList<String>();
		
		
		for (String stringValue : input) {
			listInput.add(stringValue);

		}
		Collections.sort(listInput);
		//System.out.println(listInput);
		//System.out.println("Size :" + listInput.size());
		for (int i = (listInput.size()-1); i >= 0; i--) {
		System.out.println(listInput.get(i));
	}
	}

}
