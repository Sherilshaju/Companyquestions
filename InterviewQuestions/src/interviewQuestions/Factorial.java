package interviewQuestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int fact=1,i;
    System.out.println("Enter the number");
    int n=s.nextInt();
    if(n==0)
    {
    	System.out.println("0 Factorial is 1");	
    }
    else
    {
    for(i=1;i<=n;i++)
    {
    	fact=fact*i;
    }
System.out.printf("%d Factorial is %d",n,fact);
	}
	}

}
