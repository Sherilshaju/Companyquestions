package interviewQuestions;

import java.util.Scanner;

public class Arrayinsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("Enter the size");
	    int n=s.nextInt();
	    int a[]=new int[n];
	    System.out.println("Enter the array elements");
	    for(i=0;i<n;i++)
	    {
	    	a[i]=s.nextInt();
	    }
	    System.out.println("Enter the position where the element to be inserted");
	    int p=s.nextInt();
	    System.out.println("Enter the  element to be inserted");
	    int e=s.nextInt();
	    for(i=0;i<p-1;i++)
	    {
	    	System.out.printf("%d ",a[i]);
	    }
	    System.out.printf("%d ",e);
	    for(i=p-1;i<n;i++)
	    {
	    	System.out.printf("%d ",a[i]);
	    }
	    
	}

}
