package exercise;
import java.util.Scanner;
public class Fib2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i,count=0;
	System.out.println("Enter the number");
	int n=s.nextInt();
	int a=0;
	int b=1;
	for(i=2;i<2*n;i++)
	{
		int c=a+b;
		if(n==c)
		{
			count++;
		}
		a=b;
		b=c;
	}
		if(count!=0)
		{
		System.out.printf("%d is in fibonacci series",n);
		}
		else
		{
			System.out.printf("%d is in  NOT fibonacci series",n);
		}
	
	}

	}
	


