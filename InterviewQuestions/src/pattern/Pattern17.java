package pattern;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i,j,k,p;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    for(i=0;i<n;i++)
	    {
	    	for(j=0;j<=i;j++)
	    	{
	    		System.out.print(j+1);
	    	}
	    	for(p=n-1;p>i;p--)
	    	{
	    	System.out.printf(" ");
	    	}
	    	for(k=i;k>=0;k--)
	    	{
	    		System.out.print(k+1);
	    	}
	    	System.out.println();
	    }

	}

}
