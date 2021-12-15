package basic;

public class Factorial {
	public static void main(String prasanna[])
	{
	int n=5,i,fact=1;
	/*for(i=n;i>0;i--)
	{
		fact=fact*i;
	}*/
	System.out.println(fact(n));
	}
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		 return n*fact(n-1);
		
	}

}
