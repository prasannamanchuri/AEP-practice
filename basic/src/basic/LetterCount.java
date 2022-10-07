package basic;

import java.util.HashMap;

public class LetterCount {

	public static void main(String[] args) {
		HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
		String s1="prasanna";
		char[] s=s1.toCharArray();
		for(int i=0;i<s.length;i++)
		{
		if(h1.containsKey(s[i]))
		{
		Integer value=h1.get(s[i]);
			value++;
			h1.put(s[i],value);
		}
		else
		{
			h1.put(s[i],1);
		}
		}
		System.out.println(h1);
		for(Character k:h1.keySet()) 
		{
			System.out.println(k+""+h1.get(k));
		}

	}
	

}
