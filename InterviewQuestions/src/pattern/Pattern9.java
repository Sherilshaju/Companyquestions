package pattern;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j,k=0;
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(i=n;i>=0;i--)
		{
			for(j=i;j>=0;j--)
			{
			System.out.printf("%c ",j+65);
		
			}
			System.out.println();

		}

	}

}
