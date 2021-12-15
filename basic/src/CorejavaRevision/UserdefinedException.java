package CorejavaRevision;

class MyException extends Exception {

	public MyException(String string) {
	super(string);
	} 

	/*public String toString(String s) {
		return s;
	}*/

}

public class UserdefinedException {

	public static void main(String args[]) {
		try {

			throw new MyException("hi");
		} catch (MyException ex) {
			System.out.println("Caught");
			ex.printStackTrace();
			//System.out.println(ex.getMessage());
		}
	}
}
