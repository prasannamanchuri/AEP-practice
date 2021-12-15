package CorejavaRevision;

abstract class Emp {
	public void demo() {
		System.out.println("normal method in abstract class");
	}

	abstract void salary();

}

public class Abstraction extends Emp {
	@Override
       void salary() {
		double salary=5000;
	System.out.println(salary);
	}
	public void demo2()
	{
		System.out.println("normal method");
	}

	public static void main(String[] args) {
		Emp e=new Abstraction();
		e.salary();
		e.demo();
		Abstraction a=new Abstraction();
		a.demo2();
		
		
		
		

	}

}
