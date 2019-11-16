package interviewQuestions;
import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=n;
		int i;
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			int fact=1;
			for(i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		
		if(sum==a)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not Strong number");
		}
	}

}
