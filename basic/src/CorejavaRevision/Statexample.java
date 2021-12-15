package CorejavaRevision;

public class Statexample {
	static int i, j, k;
	int a, b,age,c;
	String name;
	public Statexample()
	{
	}
	public Statexample(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
	static {
		i = 10;
		j = 10;
		k = i + j;
	}
	{
		name = "Krishna";
		age = 25;
	}

	public void test() {
		int p = 1;
		c = a + b;
		System.out.println("inside non satic method");
		System.out.println("local variable p is " + p);
		System.out.println(" global variable c is " + c);
	}

	public static void test1() {
		k = i * j;
		System.out.println("static method k value is " + k);
	}
	public static void main(String[] args) {
		Statexample s1 = new Statexample(22,"prasanna");
		System.out.println("k in static block is " + Statexample.k);
		Statexample s = new Statexample();
		System.out.println("non static block name and age "+s.name+","+s.age);
		s.test();
		Statexample.test1();
		

	}

}
