package pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int i,j,k=0,x,m;
    System.out.println("Enter the number");
    int n=s.nextInt();
    for(i=1;i<=n;i++)
    {
    	
    	for(j=1;j<=i;j++)
    	{
    		k=j;
    		System.out.print(k);
    	}
    	System.out.println();
    }
	}

}
