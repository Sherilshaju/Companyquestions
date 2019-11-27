package pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j,k;
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=2*(n-i);j>=0;j--)
			{
				System.out.printf(" ");
			}
				for(k=0;k<=i;k++)
				{
					System.out.print("* ");	
					
				}
			
			System.out.println();
		}
	}

}
