package interviewQuestions;

import java.util.Scanner;

public class Arclength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		//int i,sum=0;
	    int r=s.nextInt();
	    System.out.println("Enter the angle of the arc");
	    float a=s.nextFloat();
	   
	    double arc_length=2*3.14*r*a/360;
	    System.out.printf("%.2f",arc_length);

	}

}
