package interviewQuestions;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the number");
		int n=s.nextInt();
		while(n!=0)
		{
		int r=n%10;
		sum=sum+r;
		n=n/10;
		}
		System.out.println(sum);
		
	}

}
