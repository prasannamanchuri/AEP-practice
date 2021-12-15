package CorejavaRevision;

//Java code for thread creation by extending
//the Thread class
class MultithreadingDemo extends Thread {
	public void run() {

		System.out.println("Thread " + Thread.currentThread().getId() + " is running");

	}
}

public class MultiThreadusingExtends {
	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo t = new MultithreadingDemo();
			t.start();
		}
	}
}
 