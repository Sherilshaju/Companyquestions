package interviewQuestions;

import java.util.Scanner;

public class DectoBin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int i=0;
		int x[]=new int[10];
		while(a!=0)
		{
			x[i]=a%2;
			i++;
			a=a/2;
			
		}

	}

}
