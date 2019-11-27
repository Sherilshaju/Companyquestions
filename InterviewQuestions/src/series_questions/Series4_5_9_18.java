package series_questions;

import java.util.Scanner;

public class Series4_5_9_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    int a=4;
	    System.out.print(a+" ");
	    int b;
	    for(i=1;i<n;i++)
	    {
	    	b=(i*i)+a;
	    	System.out.print(b+" ");
	    	a=b;
	    }
	}

}
