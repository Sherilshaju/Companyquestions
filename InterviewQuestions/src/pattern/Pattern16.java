package pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		    int i,j;
		    System.out.println("Enter the number");
		    int n=s.nextInt();
		    for(i=0;i<n;i++)
		    {
		    	for(j=0;j<n;j++)
		    	{
		    		if(i==j)
		    		{
		    			System.out.print("* ");
		    		}
		    		else if(i+j==n-1)
		    		{
		    			System.out.print("* ");
		    		}
		    		else
		    		{
		    			System.out.print("0 ");
		    		}
		    	}
		    	System.out.println();
		    }
	}

}
