package interviewQuestions;

import java.util.Scanner;

public class Hypoftriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double hyp;
		System.out.println("Enter the base of the Triangle");
		int b=s.nextInt();
		System.out.println("Enter the height of the Triangle");
		int h=s.nextInt();
		double p=(b*b)+(h*h);
		hyp=Math.sqrt(p);
		System.out.printf("Hypotenuse of triangle is %d",(int)hyp);
		

	}

}
