package pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,j;
		char c;
		System.out.println("Enter the String");
		String n=s.next();
		int len=n.length();
		for(i=0;i<len;i++)
		{
			for(j=0;j<=i;j++)
			{
				 c=n.charAt(j);
				System.out.printf("%c ",c);
			}
			System.out.println();
		}

	}

}
