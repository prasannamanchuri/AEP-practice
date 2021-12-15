package CorejavaRevision;

public class Builder {
	public static void main(String[] args) {
		 StringBuilder s2= new StringBuilder("Raja");
		 System.out.println(s2);
		 StringBuilder s1= new StringBuilder();
		 s1.append("");
		 System.out.println(s1.capacity());
		 s1.append("hello ***************************");
		 System.out.println(s1);
		 s1.insert(5," prasanna");
		 System.out.println(s1);
		 s1.replace(0,5,"hi");
		 System.out.println(s1);
		 System.out.println(s1.capacity());
		 System.out.println(s1.substring(3,11));
		 System.out.println(s1.length());
		 s1.reverse();
		 System.out.println(s1);
	
		 

	}

}
