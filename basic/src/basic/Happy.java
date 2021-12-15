package basic;

public class Happy {
	public static void main(String args[])
    {
	 int n=1,m=n;
	 if(n>9)
	 {
        while(m>9)
        {
        	m=happy(m);
        }
        if(m==1)
        {
        	System.out.println("happy number");
        }
        else
        	System.out.println(" not happy number");
	 }
	 else
		 System.out.println("please enter atleast 2 digit number");
    }
	public static int happy(int n)
	{
		int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r);
            n=n/10;
            System.out.println("r is:"+r+",n is:"+n+",sum is:"+sum);
        
        }
        return sum;
	}
}
