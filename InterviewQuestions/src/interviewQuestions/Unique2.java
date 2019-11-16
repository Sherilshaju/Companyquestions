package interviewQuestions;

import java.util.Scanner;

public class Unique2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
		int f=0;
		int i,j;
		System.out.println("Enter the size");
		int n=s.nextInt();
		 int a[]=new int[n];
		    int count=0;
		    System.out.println("Enter the array elements");
		    for(i=0;i<n;i++)
		    {
		    	a[i]=s.nextInt();
		    }
		    System.out.println("Unique elements are");
		    for(i=0;i<n;i++)
		    {
		    	//count=0;
		    	for(j=0;j<i;j++)
			    {
			    	if(a[i]==a[j])
			    	{
			    		break;
			    	}
			    }
		    	if(i==j)
		    	{
		    		System.out.println(a[i]+"");
		    	}
			    
	          }

}
	}
