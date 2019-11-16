package interviewQuestions;

import java.util.Scanner;

public class Perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int i,sum=0;
	    int n=s.nextInt();
	    int a=n;
	    for(i=1;i<n;i++)
	    {
	    	if(n%i==0)
	    	{
	    	sum=sum+i;	
	    	}
	    }
	    if(a==sum)
	    {
	    	System.out.println("Perfect number");
	    }
	    else
	    {
	    	System.out.println("Not a Perfect number");
	    }

	}

}
