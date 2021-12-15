package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		int left = 1, right = 15, i;

		boolean flag = false;
		// List<Integer> l1=new ArrayList<Integer>();
		Set<Integer> s1 = new HashSet<Integer>();
		for (i = left; i <= right; i++) {
			if (i < 10) {
				s1.add(i);
			} else {
				Integer temp = i;
				String s = temp.toString();
				int j = 0;
				for (int k = 0; k < s.length(); k++) {
					int r = (Integer.parseInt("" + s.charAt(k)));
					if (r != 0) {

						if (i % r == 0) {
							j = j + 1;

						}
					}

				}
				System.out.println(j + "   " + s);
				if (j == s.length()) {
					s1.add(i);
				}

			}
		}
		System.out.println(s1);
	}
}
