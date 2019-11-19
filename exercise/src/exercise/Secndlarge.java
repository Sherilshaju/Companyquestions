package exercise;

import java.util.Scanner;

public class Secndlarge {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=s.nextInt();
	int a[]=new int[10];
	//int max=a[0];
	int temp,i,j;
	System.out.println("Enter the array elements");
	for(i=0;i<n;i++)
	{
		 a[i]=s.nextInt();
	}
	
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	System.out.println(a[n-2]);


	}

}

