package pattern;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int  i, j,k;
		 Scanner s = new Scanner(System.in);
       System.out.print("Enter the number of rows: ");
      int n = s.nextInt();

       for (i = 0; i < n; i++) 
       {
    	   for(j=0;j<=i;j++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.print(" ");
    	   for(k=0;k<=i;k++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
    	   
       }

	}

}
