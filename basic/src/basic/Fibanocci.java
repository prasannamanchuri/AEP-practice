package basic;

public class Fibanocci {
	int a=0,b=1,c=0;
	public void num()
	{
		
		do
		{
			a=b;
			b=c;
			c=a+b;
			if(c<=100)
			System.out.print(" "+c);
			
		}while(c<=100);
		
	}

	public static void main(String[] args) {
		
		Fibanocci f=new Fibanocci();
		f.num();
	}

}
