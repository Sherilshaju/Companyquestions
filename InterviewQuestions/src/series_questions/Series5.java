package series_questions;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    double a=0.5;
	    System.out.print(a+" ");
	    double b;
	    for(i=1;i<n;i++)
	    {
	    	b=a*3.0;
	    	System.out.print(b+" ");
	    	a=b;
	    }
	}

}
