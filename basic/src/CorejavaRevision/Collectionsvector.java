package CorejavaRevision;

import java.util.Iterator;
import java.util.Vector;

public class Collectionsvector {
	public static void main(String args[]){  
		Vector<String> v=new Vector<String>();  
		v.add("prasanna");  
		v.add("ravi");  
		v.add("hani");  
		v.add("keerthi");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
