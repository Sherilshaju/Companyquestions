package interviewQuestions;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size");
	    int n=s.nextInt();
	    int a[]=new int[n];
	    int count=0;
	    System.out.println("Enter the array elements");
	    for(int i=0;i<n;i++)
	    {
	    	a[i]=s.nextInt();
	    }
	    System.out.println("Unique elements are");
	    for(int i=0;i<n;i++)
	    {
	    	count=0;
	    	for(int j=0;j<i-1;j++)
		    {
		    	if(a[i]==a[j])
		    	{
		    		count++;
		    	}
		    }
	    	for(int k=i+1;k<n;k++)
	    	{
	    		if(a[i]==a[k])
		    	{
		    		count++;
		    	}
	    		
	    	}
	    	if(count==0)
	    	{
	    		System.out.printf("%d\n",a[i]);
	    	}
	    }
	}

}
