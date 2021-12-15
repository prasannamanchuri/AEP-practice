package basic;

class Test {
	
	int k;
	double d;
	float f;
	boolean istrue;
	String p;
	long l;
	char c;

	public void printValue() {
		System.out.println("int default value = "+ k);
		System.out.println("double default value = "+ d);
		System.out.println("float default value = "+ f);
		System.out.println("boolean default value = "+ istrue);
		System.out.println("String default value = "+ p);
		System.out.println("longdefault value = "+ l);
		System.out.println("char default value = "+ c);
	}
}

public class Default {
	public static void main(String argv[]) {
		Test t1 = new Test();
		t1.printValue();
	}
}