package interviewQuestions;

import java.util.Scanner;

public class Deletevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;
		char c;
		System.out.println("Enter the String");
		String str=s.nextLine();
		
		int l=str.length();
		for(i=0;i<l;i++)
		{
		 c=str.charAt(i);
		 if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		 {
			 System.out.printf(""); 
		 }
		 else
		 {
			 System.out.printf("%s",c);
		 }
		}
		
		
	}

}
