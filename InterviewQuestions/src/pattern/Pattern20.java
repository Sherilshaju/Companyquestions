package pattern;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i,j,k,p;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    for(i=1;i<=n;i++)
	    {
	    	for(j=1;j<=n;j++)
	    	{
	    		
             if(i==1||i==2)
             {
            	 System.out.print("C");
             }
             else if(i==n||i==n-1)
             {
            	 System.out.print("K"); 
             }
             
             else 
             {
            	 if(i==2&&j==3||i==2&&j==4)
            	 {
            	 System.out.print("S");
            	 
            	 }
            	 System.out.print("S");
             }
	    
	    	}
	    	System.out.println();
	    }
	}

}
