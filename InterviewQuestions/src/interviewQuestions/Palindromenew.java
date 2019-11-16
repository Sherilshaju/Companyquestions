package interviewQuestions;

import java.util.Scanner;

public class Palindromenew {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=s.nextInt();
    int a=n;
    int rev=0;
    while(n!=0)
    {
    	int r=n%10;
    	rev=(rev*10)+r;
    	n=n/10;
    }
    if(a==rev)
    {
    	System.out.println("Palindrome");
    }
    else
    {
    	System.out.println("Not Palindrome");
    }

	}

}
