package exercise;
import java.util.Scanner;
public class Fib1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int a=0;
	int b=1;
	System.out.printf("%d %d ",a,b);
	for(int i=2;i<n;i++)
	{
		int c=a+b;
		a=b;
		b=c;
		System.out.printf("%d ",c);
	}

	}

}
