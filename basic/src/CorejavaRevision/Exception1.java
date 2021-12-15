package CorejavaRevision;

import java.io.IOException;

public class Exception1
{
  static void check() throws MyException
  {  
    System.out.println("Inside check function");
    //throw new ArithmeticException("demo");
   // throw new ClassNotFoundException("demo");
    throw new MyException("my exception");
  }
  static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}
 public static void main(String args[]) throws MyException, IOException
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
    try
	{
		fun();
	}
	catch(IllegalAccessException e)
	{
		e.printStackTrace();
		System.out.println("caught in main.");
	}
  }
}
