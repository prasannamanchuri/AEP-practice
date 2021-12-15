package basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.*;

class WorkerThreads implements Callable<String> {
	private String message;

	public WorkerThreads(String s) {
		this.message = s;
	}

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processmessage(); 
        System.out.println(Thread.currentThread().getName()+" (End)"); 
		return message;
	}
	private void processmessage() {  
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    } 
}

public class Threadsubmit {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		List<Future<String>> list=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(executor.submit(new WorkerThreads("" + i)));
		}
		int i=0;
		Thread.sleep(2000);
		//list.get(2).cancel(true);
		for(Future<String> f:list) {
			//System.out.println(f.get());
			System.out.println(f.isDone());
		}
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } executor.shutdownNow();
		 */
		/*
		 * for (int i = 11; i < 20; i++) { Runnable worker = new WorkerThreads("" + i);
		 * executor.execute(worker); }
		 */
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}