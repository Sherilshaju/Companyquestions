package interviewQuestions;

import java.util.Scanner;

public class Powerofagivennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;
		int p=1;
		System.out.println("Enter the base value");
		int b=s.nextInt();
		System.out.println("Enter the exponent value");
		int e=s.nextInt();
		for(i=1;i<=e;i++)
		{
			p=p*b;
		}
		System.out.printf("%d power %d is %d ",b,e,p);
		
	}

}
