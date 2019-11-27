package series_questions;

import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i;
	    double c,d;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    double a=1;
	    double b=2.0;
	    c=1;
	    System.out.printf("%d %.1f",(int)a,b);
	    i=3;
	    while(i<=n)
	    {
	    	if(i%2==1)
	    	{
	    		c=c*3.0;
	    		System.out.printf(" %.1f",c);
	    	}
	    	else
	    	{
	    		b=b*3.0;
	    		System.out.printf(" %.1f",b);
	    	}
	    	i++;
	    }
	    
	}

}
