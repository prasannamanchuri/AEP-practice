package CorejavaRevision;

public class Buffer {

	public static void main(String[] args) {
		 StringBuffer s1= new StringBuffer();
		 s1.append("hello");
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
