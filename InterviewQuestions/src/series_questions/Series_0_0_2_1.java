package series_questions;

import java.util.Scanner;

public class Series_0_0_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    int a=0;
	    int b=0;
	    int f=0;
		//System.out.printf(" %d", a);
		//System.out.printf(" %d", b);
	    for(i=3;i<=n;i++)
	    {
	    	if(i%2!=0)
	    	{
	    		a=a+2;//numbers in odd position incremented by 2
	    		//System.out.printf(" %d", a);/
	    		f=1;
	    	}
	    	if(i%2==0)
	    	{
	    		b=b+1;//numbers in odd position incremented by 1
	    		//System.out.printf(" %d", b);
	    		f=0;
	    	}
	    }
	    if(f==1)
	    {
	    	System.out.println(a);
	    }
	    else
	    {
	    	System.out.println(b);
	    }
	    
	    
	    	
	    
	}

}
