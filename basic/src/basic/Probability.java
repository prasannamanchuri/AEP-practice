package basic;

import java.util.ArrayList;
import java.util.List;

public class Probability {
	int c = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

	String s1;
	List<String> l1 = new ArrayList<String>();

	int ar1[] = { 1, 0, -1, 1,0 };

	public void combination() {
		System.out.println("  input is:");
		for (int p = 0; p < ar1.length; p++) {
			System.out.print(ar1[p] + " ,");
		}

		for (int i = 0; i < ar1.length; i++) {
			for (int j = i; j < ar1.length; j++) {
				s1 = (ar1[i] + "" + ar1[j]);
				s1.toString();

				l1.add(s1);
				if (s1.equals("11")) {
					c++;
				} else if (s1.equals("00")) {
					c1++;
				} else if (s1.equals("-1-1")) {
					c2++;
				} else if (s1.equals("01") || s1.equals("10")) {
					c3++;
				} else if (s1.equals("0-1") || s1.equals("-10")) {
					c4++;
				} else if (s1.equals("-11") || s1.equals("1-1")) {
					c5++;
				}

			}
		}
		System.out.println(l1);
		System.out.println("no of 11 combination: " + c);
		System.out.println("no of 00 combination: " + c1);

		System.out.println("no of -1-1 combination: " + c2);

		System.out.println("no of 01/10  combination: " + c3);

		System.out.println("no of 0-1/-10 combination: " + c4);

		System.out.println("no of 1-1/-11 combination: " + c5);

	}

	public static void main(String[] args) {

		Probability p = new Probability();
		p.combination();

	}
}
