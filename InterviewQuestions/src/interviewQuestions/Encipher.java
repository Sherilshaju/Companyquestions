package interviewQuestions;

import java.util.Scanner;

public class Encipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		int i;
		for(i=0;i<str.length();i++)
		{
		int c=str.charAt(i);
		c=c+2;
		char d=(char)c;
		System.out.printf("%s ",d);
	}
	}
}


