package interviewQuestions;

import java.util.Scanner;

public class Perfectsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		double sqrt=Math.sqrt(n);
		double p=sqrt*sqrt;
		if(p==n)
		{
			System.out.println("Perfect Square");
		}
		else
		{
			System.out.println("Not a Perfect Square");
		}
	}

}
