package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinIndexList {

	public static void main(String[] args) {
		int i, j,index;
		HashMap<String, Integer> m1 = new HashMap<String, Integer>();
		List<String> l1 = new ArrayList<String>() {
			{
				add("KFC");
				add("MFC");
				add("5STAR");
			}
		};

		List<String> l2 = new ArrayList<String>() {
			{
				add("MFC");
				add("KFC");
				add("5STAR");
			}

		};
		for (i = 0; i < l1.size(); i++) {
			for (j = 0; j < l2.size(); j++)

				if (l1.get(i).equals(l2.get(j))) {
					 index = i + j;
					m1.put(l1.get(i), index);
				}
		}
		int min=0;
		for(String s1:m1.keySet())
		{
			System.out.println(s1+" key is"+m1.get(s1));
			if(m1.get(s1)<min)
			{
				min=m1.get(s1);
			}
			else
			{
				min=m1.get(s1);
			}
			
		}
		for(String s1:m1.keySet())
		{
			if(min==m1.get(s1))
			System.out.println("common intrest is:"+s1);
			
		}
		if(m1.size()==0)
		{
			System.out.println("they donot have common intrest");
		}
		
	}

}
