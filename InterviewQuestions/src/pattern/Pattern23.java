package pattern;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
	    int i,j,k,p;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    for(i=0;i<n;i++)
	    {
	    	
	    	for(j=0;j<n;j++)
	    	{
	    		if(i==0)
		    	{
	    			System.out.print("C");
		    	}
	    		else if(i==n-1)
	    		{
	    			System.out.print("K");	
	    		}
	    		else
	    		{
	    			if(i==j||(i+j)==n-1)
	    			{
	    				System.out.print("S");
	    			}
	    			else
	    			{
	    				System.out.print("*");
	    			}
	    		}
	    	}
	    	System.out.println();
	    }
	}
}
	       
