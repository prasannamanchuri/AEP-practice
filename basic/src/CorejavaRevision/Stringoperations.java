package CorejavaRevision;

public class Stringoperations {
	public static void main(String[] args) {
		String s5 = " ";
		String s1 = "Java String pool refers to collection of Strings which are stored in heap memory";
		String s = "java string pool refers to collection of Strings which are stored in heap memory";
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		String s3 = s1.toUpperCase();
		System.out.println(s3);
		String s4 = s1.replace('a', '$');
		System.out.println(s4);
		boolean b = s1.contains("refers");
		System.out.println(b);
		boolean b1 = s1.equals(s);
		System.out.println(b1);
		boolean b2 = s1.equalsIgnoreCase(s);
		System.out.println(b2);
		String a[] = s1.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		char c1 = s.charAt(6);
		System.out.println(c1);
		int l = s1.length();
		System.out.println(l);
		String substring = (String) s1.subSequence(12, 23);
		System.out.println(substring);
		String add = s1.concat("hi prasanna");
		System.out.println(add);
		int index = s1.indexOf("refers");
		System.out.println(index);
		boolean end = s1.endsWith("memory");
		System.out.println(end);
		boolean empty = s1.isBlank();
		System.out.println(empty);
	}

}
