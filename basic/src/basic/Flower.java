package basic;

import java.util.ArrayList;
import java.util.List;

public class Flower {

	public static void main(String[] args) {
		int n = 2, m = 0;
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> l1 = new ArrayList<Integer>() {
			{
				add(1);
				add(0);
				add(0);
				add(0);
				add(1);

			}
		};
		for (int i = 0; i < l1.size(); i++) {
			if (i == 0 && l1.get(i) == 0 && l1.get(i) == l1.get(i + 1)) {
				m = m + 1;
				l2.add(i);

			} else if (i == (l1.size() - 1) && l1.get(i) == 0 && (!l2.contains(i - 1)) && l1.get(i) == l1.get(i - 1)) {

				m = m + 1;
				l2.add(i);

			} else {

				if (l1.get(i) == 0 && (!l2.contains(i - 1)) && l1.get(i) == l1.get(i + 1)
						&& l1.get(i) == l1.get(i + 1)) {
					m = m + 1;
					l2.add(i);

				}
			}
		}
		System.out.println(m);
		if (n <= m) {

			System.out.println("plants can be planted");
			System.out.println("true");
		} else {
			System.out.println("plants cannot be planted");
			System.out.println("false");
		}

	}

}
