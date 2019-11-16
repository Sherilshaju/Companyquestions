package interviewQuestions;

import java.util.Scanner;

public class Nthfib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Limit");
	    int n=s.nextInt();
	    int i,c=0;
	    int a=0;
	    int b=1;
	   
	    for(i=2;i<n;i++)
	    {
	    	c=a+b;
	    	
	    	a=b;
	    	b=c;
	    }
	    System.out.printf("%d ",c);
	}

}
