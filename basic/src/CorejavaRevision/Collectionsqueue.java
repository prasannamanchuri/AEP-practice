package CorejavaRevision;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Collectionsqueue {
	public static void main(String args[]){  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("prasanna");  
		queue.add("anjali");  
		queue.add("preethi");  
		queue.add("manisha");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());   
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		}  

}
