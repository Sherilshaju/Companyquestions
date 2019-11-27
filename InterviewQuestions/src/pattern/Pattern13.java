package pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i, j;
		 Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
       int n = s.nextInt();
 
        for (i = 1; i <= n; i++) 
        {
        	for(j=1;j<=n;j++)
        	{
        		if(i==j)
        		{
        			System.out.print("0");	
        		}
        		else
        		{
        			System.out.print(i);
        		}
        		
        	}
        	System.out.println();
        }
        

	}

}
