package interviewQuestions;

import java.util.Scanner;

public class Centitofarenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature in centigrade");
	    double c=s.nextInt();
	    double f=(c * 9/5) + 32;
	    System.out.printf("Temperature in Fahrenheit is %.2f F ",f);
	}

}
