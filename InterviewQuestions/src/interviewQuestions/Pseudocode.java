package interviewQuestions;

import java.util.Scanner;

public class Pseudocode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int j,k;
		String s1=s.next();
		String s2=s.next();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(k=0;k<c1.length;k++)
		{
			for(j=0;j<c2.length;j++)
			{
			c1[k]=c2[j];
			}	
		}
		c1[k]=' ';
		System.out.println(s1);
	}

}
