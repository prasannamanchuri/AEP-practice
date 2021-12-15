package basic;

import java.util.ArrayList;
import java.util.List;

public class Appendstring {
	int i;
	public List<Integer> addnext(List<Integer> l1)
	{
		String s="";
		List<Integer> l2=new ArrayList<Integer>();
	     for( i=0;i<l1.size();i++)
	     {
	    	 System.out.println(l1.get(i));
	    	 s=s+l1.get(i);
	     }
	     System.out.println(Integer.parseInt(s)+1);
	     String s1=Integer.toString(Integer.parseInt(s)+1);
	     for(i=0;i<s1.length();i++)
	     {
	    	 l2.add(Integer.parseInt(""+s1.charAt(i)));
	     }
	     
	     
	     //System.out.println(l1.get(0)+l1.get(1)+l1.get(2)+l1.get(3));
		return l2;
	     
	}
	public static void main(String args[])
	{
		Appendstring a1= new Appendstring();
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(1);
		System.out.println(a1.addnext(l1));
		
		
	}
	
}
