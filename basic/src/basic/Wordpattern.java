package basic;

import java.util.HashMap;

public class Wordpattern {

	public static void main(String  args[]) {
		String pattern = args[0] ;
	    String s = args[1] ;
		//String pattern = "abbac";
		//String s = "hi hello helloy hi ho";
		boolean flag=false;
		HashMap<Character, String> map = new HashMap<Character, String>();
		
		/*
		 * =s.split(" "); int a[]=new int[5]; float f[]=new float[5]; char c[]=new
		 * char[5]; Employee e[]=new Employee[4];
		 */
		String s1[] = s.split(" ");
		if (pattern.length() == s1.length) {
			for (int i = 0; i < pattern.length(); i++) {
				char c = pattern.charAt(i);
				if (map.containsKey(c)) {
					String value = map.get(c);
					if (!value.equals(s1[i])) {
						flag = true;
						System.out.println("value:"+value+" does not match with :"+s1[i]);
						break;

					}
					/*
					 * else { System.out.println("true"); }
					 */
				} else {
					map.put(c, s1[i]);
					System.out.println("key:"+c+" and value :"+s1[i]);
				}

			}
			if (flag == true) {
				System.out.println("false");
			} else
				System.out.println("true");

		} else {
			System.out.println("false");
		}
	}
}
