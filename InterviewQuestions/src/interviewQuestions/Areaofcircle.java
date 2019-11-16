package interviewQuestions;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double area;
		System.out.println("Enter the radius of the circle");
		int r=s.nextInt();
		area=3.14*r*r;
		System.out.println("Area of the circle is "+area);
	}

}
