package pattern;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i,j,k,p;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    for(i=1;i<=n;i++)
	    {
	    	for(j=1;j<=2*n+1;j++)
	    	{
	    		if(i+j==7||j==i+5)
	    		{
	    			System.out.print("*");
	    		}
	    		else
	    		{
	    			System.out.print("#");
	    		}
	    	}
	    	System.out.println();
	    }

	}

	}

