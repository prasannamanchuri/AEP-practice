package CorejavaRevision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Nestedtry {
	public static void main(String args[]) throws FileNotFoundException {
		FileInputStream GFG = null;
		try {

			int a[] = { 1, 2, 3, 4, 5 };

			System.out.println(a[5]);

			try {

				int x = a[1] / 0;
			} catch (ArithmeticException e2) {
				System.out.println("division by zero is not possible");
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Element at such index does not exists");
			try {

				int x = 5/ 0;
			} catch (ArithmeticException e2) {
				System.out.println("division by zero is not possible");
			}

		}
		finally {
			System.out.println("finally block executed");
			/*try {
				GFG = new FileInputStream(
					"/home/mayur/GFG.txt");
				//throw FileNotFoundException("file path is wrong");
			}
			catch (FileNotFoundException e) {
				System.out.println("file does not find");
				
			}*/
			GFG = new FileInputStream(
					"/home/mayur/GFG.txt");
				throw new FileNotFoundException("file path is wrong");
		}
	}

}
