package interviewQuestions;

import java.util.Scanner;

public class Greatestof3nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a>c)
		{
			System.out.printf("largest number is %d",a);
		}
		else if(b>a&&b>c)
		{
			System.out.printf("largest number is %d",b);
		}
		else
		{
			System.out.printf("largest number is %d",c);
		}

	}

}
