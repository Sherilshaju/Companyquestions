package pattern;

import java.util.Scanner;

public class Patterndiamond19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i,j,k,p;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    for(i=0;i<n;i++)
	    {
	    	for(k=n;k>=i;k--)
	    	{
	    		System.out.print(" ");	
	    	}
	    	for(j=i;j>=0;j--)
		    	{
		    		System.out.printf("%d ",j+1);
		    	}
		    	System.out.println();	
	    }
	    for(i=n-2;i>=0;i--)
	    {
	    	for(k=n;k>=i;k--)
	    	{
	    		System.out.print(" ");	
	    	}
	    	for(j=i;j>=0;j--)
		    	{
		    		System.out.printf("%d ",j+1);
		    	}
		    	System.out.println();	
	    }
	}

}
