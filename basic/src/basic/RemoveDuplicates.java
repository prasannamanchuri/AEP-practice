package basic;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	 public List<Integer> duplicate(List<Integer> l1)
	 {
		 List<Integer> l2=new ArrayList<Integer>();
		 for(Integer item:l1)
		 {
			 if(!l2.contains(item))
			 {
				 l2.add(item);
			 }	 
		 }
		 System.out.println(l1);
		 System.out.println(l2);
		 
		 return l1;

		 
	 }

	public static void main(String[] args) {
		RemoveDuplicates r=new RemoveDuplicates();
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(12);
		l1.add(13);
		r.duplicate(l1);

		

	}

}
