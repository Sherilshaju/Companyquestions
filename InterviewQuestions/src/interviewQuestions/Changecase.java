package interviewQuestions;

import java.util.Scanner;

public class Changecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=s.next().charAt(0);
		if(c>=65&&c<97)
		{
			System.out.println(Character.toLowerCase(c));
		}
		else if(c>=97&&c<=122)
		{
			System.out.println(Character.toUpperCase(c));
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
