package CorejavaRevision;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionArraylist {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("prasanna");//Adding object in arraylist  
		list.add("bhanu");  
		list.add("Ravi");  
		list.add("hani");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
