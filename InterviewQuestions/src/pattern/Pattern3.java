package pattern;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j,k;
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.printf(" ");		
			}
			for(k=1;k<=(2*i)-1;k++)
			
				{
				System.out.printf("*");		
			   }
			
			System.out.println();	
		
		}
	
}
	
	
}


