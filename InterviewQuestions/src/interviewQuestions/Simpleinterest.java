package interviewQuestions;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
	    System.out.println("Enter the Principle Amount");
	    float p=s.nextFloat();
	    System.out.println("Enter the number of years");
	   int n=s.nextInt();
	    System.out.println("Enter the rate of interest");
	   float r=s.nextFloat();
	    double SI=(p*n*r)/100;
	    System.out.printf("Simple interest is %.2f",SI);
	   
	}

}
