package pattern;

import java.util.Scanner;

public class Assessment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 
		  int i,j;
		  char c;
		   String str=s.next();
		  int n=s.nextInt();
		  for(i=0;i<n;i++)
		  {
			  for(j=0;j<=i;j++)
			  {
				  c=str.charAt(j);
				  System.out.printf("%c ",c);
			  }
			  System.out.println();
		  }
		  for(i=n-1;i>0;i--)
		  {
			  for(j=0;j<i;j++)
				  {
					 c=str.charAt(j);
				  System.out.printf("%c ",c); 
			  }
			 System.out.println();
		  }
	}

}
