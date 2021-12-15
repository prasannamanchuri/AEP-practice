package CorejavaRevision;

public class Localconstructorchaining {
	Localconstructorchaining() {
		this(5);
		System.out.println("The Default constructor");
	}

	Localconstructorchaining(int x) {
		this(5, 15);
		System.out.println(x);
	}

	Localconstructorchaining(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String args[]) {
		new Localconstructorchaining();
	}

}
