package interviewQuestions;

import java.util.Scanner;

public class Lcm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=0;
		System.out.println("Enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		m=a>b?a:b;
		int lcm=0;
		while(a!=0)
		{
		if(m%a==0 && m%b==0)
		{
			lcm=m;
			break;
		}
		m++;
		}
		System.out.println("LCM is "+lcm);
			
		}
	}


