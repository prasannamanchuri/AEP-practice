package basic;

public class Testthread{
	//int counter = 1;
	static int N;

	public void printOddNumber() {
		int counter = 1;
		synchronized (this) {
			while (counter < N) {
				if(counter % 2 != 0) {
					/*try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}*/
					System.out.println("odd"+counter + " ");
				}
				//System.out.println("odd"+counter + " ");
				counter++;
				//notify();
			}
		}
	}

	public void printEvenNumber() {
		int counter = 1;
		synchronized (this) {
			while (counter < N) {
				if(counter % 2 == 0) {
					/*try {
						//wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}*/
					System.out.println("even"+counter + " ");
				}
				//System.out.println("even"+counter + " ");
				counter++;
				//notify();
			}
		}
	}
public static void main(String[] args) {
		N = 10;
		Testthread mt = new Testthread();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				mt.printEvenNumber();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				mt.printOddNumber();
			}
		});
		t1.start();
		t2.start();
	}
}
