package interviewQuestions;

import java.util.Scanner;

public class Fibnterms {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		    System.out.println("Enter the Limit");
		    int n=s.nextInt();
		    int i;
		    int a=0;
		    int b=1;
		    
		    System.out.printf("%d %d ",a,b);
		   
		    for(i=2;i<n;i++)
		    {
		    	int c=a+b;
		    	System.out.printf("%d ",c);
		    	a=b;
		    	b=c;
		    }
	}

}
