package CorejavaRevision;
class Sample1 implements Runnable {
	public void run() {

		System.out.println("Thread " + Thread.currentThread().getId() + " is running");

	}
}
	public class MultithreadRunnable{
		public static void main(String[] args)
		{
			int n = 4; // Number of threads
			for (int i = 0; i < n; i++) {
			Thread t= new Thread(new MultithreadingDemo());
				t.start();
			}
		
		}

	}



