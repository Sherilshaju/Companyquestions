package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j;
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=n-i;j>1;j--)
			{
				System.out.printf(" ");		
			}
			for(j=0;j<=i;j++)
			{
				System.out.printf("*");		
			}
			System.out.println();	
		}
	}

}
