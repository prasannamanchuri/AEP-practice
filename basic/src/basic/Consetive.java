package basic;

import java.util.*;
public class Consetive {
public static void main(String[] args) {
	Consetive c=new Consetive();
	c.consecutive();
	c.max();
	c.min();
	
}
public void consecutive()
{
	int i,sum,sub,mul,div;
	int[] n=new int[100];
	int[] result=new int[99];
	for(i=0;i<n.length;i++)
	{
		n[i]=i+1;
		
	}
	Scanner choice= new Scanner(System.in);  
    System.out.println("Enter your choice");
int ch = choice.nextInt();
switch(ch)
{
case 1: 
	for(i=0;i<result.length;i++)
	{
		result[i]=n[i]+n[i+1];
	}
	System.out.println(Arrays.toString(result));
	break;
case 2: 
	for(i=0;i<result.length;i++)
	{
		result[i]=n[i]-n[i+1];
		
	}
	System.out.println(Arrays.toString(result));
	break;
case 3: 
	for(i=0;i<result.length;i++)
	{
		result[i]=n[i]*n[i+1];
	}
	System.out.println(Arrays.toString(result));
	break;
case 4: 
	for(i=0;i<result.length;i++)
	{
	  result[i]=n[i]/n[i+1];
	}
	System.out.println(Arrays.toString(result));
	break;
	default:
		System.out.println("enter your correct option");
    	}
    }
public void max()
{
    int n, max;
    int[] arr=new int[5];
    System.out.println("Enter  five elements");
Scanner num= new Scanner(System.in);
for(int i=0;i<arr.length; i++)
{
    arr[i]=num.nextInt();
}
max = arr[0];
for(int i=0;i<arr.length;i++)
{
    if(max<=arr[i])
    {
        max=arr[i];
    }
}
System.out.println("Maximum value:"+max);
}
public void min()
	{
		int min,i;
		int[] n = {11,34,6,2,9,0,12,5,8,24};
		min=n[0];
        for(i=0;i<n.length;i++)
        {
            if(min>=n[i])
            {
                min=n[i];
            }
        }
       System.out.println("min among list is:"+min);
	}
    	
 }





