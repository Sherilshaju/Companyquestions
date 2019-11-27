package series_questions;

import java.util.Scanner;

public class Series121_225_361 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i,c;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    int a=11;
	    for(i=1;i<=n;i++)
	    {
	    	c=a*a;
	    	System.out.printf("%d ", c);
	    	a=a+4;
	    	
	    }
	}

}
