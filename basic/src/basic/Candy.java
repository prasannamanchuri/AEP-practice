package basic;

import java.util.HashMap;
import java.util.Map;

public class Candy {

	public static void main(String[] args) {
		int[] candy = {1,2,2,2,5,4,3,3,1,1,6,7,1,1};
		Map<Integer, Integer> h1 = new HashMap<Integer, Integer>();
		if ((candy.length) % 2 == 0) {
			int i = (candy.length) / 2;
			for (int j = 0; j < candy.length; j++) {
				if(!h1.containsKey(candy[j])){
					h1.put(candy[j], j);
				}
			}
			if(i<=h1.size())
			{
				System.out.println("no of candy options are:"+i);
			}
			else
			{
				System.out.println("no of candy options are:"+h1.size());
			}

		} else {
			System.out.println("enter only even number of candies");
		}

	}

}
