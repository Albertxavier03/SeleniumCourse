package week1.day2;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateArrays {

	public static void main(String[] args) {
		
		int num[] = {1,3,8,3,11,5,6,4,7,6,7}, count=0;
		List<Integer> hs = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++)
		{
			hs.add(num[i]);
		}
		for(int i=0;i<hs.size();i++)
		{
			for(int j=i+1;j<hs.size();j++)
			{
				if(hs.get(i)==hs.get(j))
					count++;
			}
			if(count>0)
			{
				System.out.println(hs.get(i)+" ");
			}
			count=0;
		}
			
		}
	
	}


