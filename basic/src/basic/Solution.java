package basic;
class Solution {

    public static void main(String args[])
    {
       /* while(sum>=9)
        {
            r=sum%10;
            q=sum/10;
            System.out.println(r+" "+q);
            sum=(r*r)+(q*q);
           
        }
        if(sum==1)
        {
            System.out.println(sum+"happy number");
        }
        else
        {
        System.out.println(sum+" not happy number");
        }
    	 n.toString();
    	for(i=0;sum<=9;i++)
    	 {
    		
    		 
    	 }*/
        System.out.println(happy(19));
        
        
    }
    public static int happy(int n)
    {
    	int sum=n,q,r;
    	if(sum<=9)
    	{
    		if(sum==1)
    			System.out.println(n+"happy number");
    		else
    			System.out.println(n+"npt happy number");
    	}
    	else
    	{
    		 r=sum%10;
             q=sum/10;
             if(q>=100)
             {
            	 
             }
           
             sum=(r*r)+(q*q);
    	}
		return happy(sum);
    	
    }
}