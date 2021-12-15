package basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WorkerThread implements Runnable {  
    private String message;  
    public WorkerThread(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processmessage(); 
        System.out.println(Thread.currentThread().getName()+" (End)");  
    }  
    private void processmessage() {  
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }  
}  
public class Fixedthread {  
     public static void main(String[] args) {  
        ExecutorService executor = Executors.newFixedThreadPool(3); 
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new WorkerThread("" + i);  
            executor.execute(worker);
          }  
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        executor.shutdownNow(); 
        for (int i = 11; i < 20; i++) {  
            Runnable worker = new WorkerThread("" + i);  
            executor.execute(worker);
          }  
        while (!executor.isTerminated()) {   }  
        
  
        System.out.println("Finished all threads");  
    }  
 }  