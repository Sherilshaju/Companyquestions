package interviewQuestions;

import java.util.Scanner;

public class Vowelsorconsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=s.next().charAt(0);
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("Character is a Vowel");
		}
		else
		{
			System.out.println("Character is a Consonant");
		}
		

	}

}
