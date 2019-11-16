package interviewQuestions;

import java.util.Scanner;

public class Arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,f=0;
		System.out.println("Enter the size");
	    int n=s.nextInt();
	    int a[]=new int[n];
	    System.out.println("Enter the array elements");
	    for(i=0;i<n;i++)
	    {
	    	a[i]=s.nextInt();
	    }
	    System.out.println("Enter the element to be searched");
	    int e=s.nextInt();
	    for(i=0;i<n;i++)
	    {
	    	if(a[i]==e)
	    	{
	    	f=1;	
	    	}
	    }
	    if(f==1)
	    {
	    System.out.printf("%d is present in the position %d",e,i-1);
	    }
	    else
	    {
	    	System.out.printf("%d is not present in the array",e);	
	    }
        
	}

}
