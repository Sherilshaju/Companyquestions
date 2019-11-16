package interviewQuestions;

import java.util.Scanner;

public class Frequencyofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		System.out.println("Enter the character");
		char c=s.next().charAt(0);
		int count=0;
		char arr[]=s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==c)
			{
				count++;
			}
		}
		System.out.printf("Frequency of %s is %d",c,count);
	}

}
