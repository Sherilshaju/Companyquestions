package interviewQuestions;

import java.util.Scanner;

public class Secondgreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int x;
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>=b&&a>=c)
		{
		if(b>=c)
		{
			x=b;
		}
		else
		{
			x=c;
		}
		}
		else if(b>=a&&b>=c)
		{
			if(a>=c)
			{
				x=a;
			}
			else
			{
				x=c;
			}
		}
		else if(a>=b)
		{
			x=a;
		}
		else
		{
			x=b;
		}
			System.out.println(x);
	}

}
