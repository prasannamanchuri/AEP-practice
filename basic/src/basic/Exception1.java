package basic;
class Exception1
{
  static void check() throws ArithmeticException
  {  
    System.out.println("Inside check function");
    throw new ArithmeticException("demo");
  }
 public static void main(String args[])
  {
	 try
     { 
         int data=25/0; 
         System.out.println(data); 
     } 
     catch(ArithmeticException e)
     {
         System.out.println(e);
     }  
     finally
     {
         System.out.println("finally block is always executed");
     } 
    try
    {
      check();
    }
    catch(ArithmeticException e)
    {
      System.out.println("caught" +e);
    }
  }
}