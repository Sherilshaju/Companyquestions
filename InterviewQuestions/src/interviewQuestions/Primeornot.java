package interviewQuestions;
import java.util.Scanner;
public class Primeornot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		if(a==1)
		{
		System.out.println("neither prime nor composite");	

		}
		int i,c=0;
		for(i=2;i<=a;i++)
		{
		if(a%i==0)
		{
			c++;
		}
		}
		
		if(c==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not prime number");
		
		}
	}

}
