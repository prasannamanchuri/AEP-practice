package basic;
public class Exception2 {
	Exception2 e;
	public static void main(String[] args) {
		int a=1;
		System.out.println(a);
	 Exception2 e=new Exception2();
		System.out.println("main "+e);
		e.sample(e);
		System.out.println("main "+e);
	}
	public void sample(Exception2 e2) {
		   e=new Exception2();
		  System.out.println("sample "+e);
		  e2.sample2();
	}
	public void sample2() {
		
     System.out.println("hi");
	}
	/*public static void main(String[] args) {
		try
        {
            int n=5;
            int result=n/0;
            int arr[]={1,4,8};
            arr[9]=6;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error:Divide by zero not allowed");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error:Array index out of bound");
        }
	catch(Exception e)
	{  
            System.out.println(e);  
	}    
	}*/

}
