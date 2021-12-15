package basic;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="pot",s2="top";
	    char[] ch=s1.toCharArray();
	    char[] ch1=s2.toCharArray();
	Arrays.sort(ch);
	Arrays.sort(ch1);
	String.valueOf(ch);
	String.valueOf(ch1);
	System.out.println(String.valueOf(ch));
	System.out.println(String.valueOf(ch1));
	 if(String.valueOf(ch).equalsIgnoreCase(String.valueOf(ch1)))

	 {
		 System.out.println("anagram");
	 }
	 else
		 System.out.println("not anagram");
	
}

}
