package CorejavaRevision;

public class Constructorchainingsuper {
	public static void main(String args[]) {
		Derived obj = new Derived("prasanna");
	}

}

class Base {
	String name;

	Base(String name) {
		this.name = name;
		System.out.println("Calling parameterized constructor of base");
	}
}

class Derived extends Base {

	Derived(String name) {
		super(name);
		System.out.println("Calling parameterized constructor of derived");
	}

}
