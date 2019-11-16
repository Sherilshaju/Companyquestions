package interviewQuestions;

import java.util.Scanner;

public class Fibrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Limit");
	    int n=s.nextInt();
	    int c[]=new int[n];
	    int i;
	    int a= 0;
	    int b=1;
	    
	   c[0]=0;
	   c[1]=1;
	    for(i=2;i<n;i++)
	    {
	    	 c[i]=a+b;
     	    	a=b;
	    	 b=c[i];
	    }
	   for(int j=n-1; j>=0;j--)
	    {
	    	 
	    	System.out.printf("%d ",c[j]);
	    	
	    }
	}

}
