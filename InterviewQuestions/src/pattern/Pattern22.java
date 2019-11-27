package pattern;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i,j,k,p;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    for(i=0;i<n;i++)
	    {
	    	if(i==0)
	    	{
	    	for(j=0;j<n;j++)
	    	{
	    			System.out.print("C");
	        }
	    	System.out.println();
	    	}
	    	else
	    	{
	    		System.out.print("S");
	    		for(k=1;k<n-1;k++)
	    		{
	    			System.out.print("*");
	    		}
	    		System.out.print("S");
	    		System.out.println();
	    	}
	    	if(i==n-1)
	    	{
	    		for(p=0;p<n;p++)
	    		{
	    			System.out.print("K");
	    		}
	    	}
	    }

	}

}
