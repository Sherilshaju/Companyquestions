package interviewQuestions;

import java.util.Scanner;

public class Stringtransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String Str=s.next();
		int l=Str.length();
		System.out.println("Enter the character to be replaced");
		String r=s.next();
		int i;
		for(i=0;i<l;i++)
		{
	 Str=Str.replaceAll(r, "*");
			
		}
		System.out.println(Str);

	}

}
