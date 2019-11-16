package interviewQuestions;
import java.util.Scanner;
public class Gcd1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=s.nextInt();
	int b=s.nextInt();
	int min=a<b?a:b;
	int i,f=0,gcd=0;
	for(i=1;i<=min;i++)
	{
		if(a%i==0&&b%i==0)
		{
			gcd=i;
		}
	}
	
		System.out.println(gcd);
	
	

	}

}
