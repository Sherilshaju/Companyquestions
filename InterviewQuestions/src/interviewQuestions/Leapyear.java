package interviewQuestions;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Year");
		int n=s.nextInt();
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
				{
					System.out.println("Leap Year");
				}
				else
				{
					System.out.println("Not a Leap Year");	
				}
			}
			else
			{
				System.out.println("Leap Year");
			}
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
		
	}

}
