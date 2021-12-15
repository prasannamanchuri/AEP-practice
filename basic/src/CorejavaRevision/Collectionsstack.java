package CorejavaRevision;

import java.util.Iterator;
import java.util.Stack;

public class Collectionsstack {
	public static void main(String args[]){  
	Stack<String> stack = new Stack<String>();  
	stack.push("prasanna");  
	stack.push("hani");  
	stack.push("keer");  
	stack.pop();  
	Iterator<String> itr=stack.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  

}

