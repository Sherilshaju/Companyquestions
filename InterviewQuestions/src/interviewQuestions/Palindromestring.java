package interviewQuestions;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
	    String a=s.next();
	    int l=a.length();
	   String rev="";
	   String a1=a;
	   for(int i=l-1;i>=0;i--)
	   {
		   rev=rev+a.charAt(i);
	   }
	   if(a1.equals(rev))
	   {
		   System.out.println("Palindrome");
	   }
	   else
	   {
		   System.out.println("Not Palindrome"); 
	   }
	    


	}

}
