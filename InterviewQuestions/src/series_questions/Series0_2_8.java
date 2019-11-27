package series_questions;

import java.util.Scanner;

public class Series0_2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i,c;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    for(i=1;i<=n;i++)
	    {
	    	if(i%2==0)
	    	{
	    	c=(i*i)-2;	
	    	}
	    	else
	    	{
	    		c=(i*i)-1;	
	    	}
	    	System.out.printf("%d ", c);
	    }
	}

}
